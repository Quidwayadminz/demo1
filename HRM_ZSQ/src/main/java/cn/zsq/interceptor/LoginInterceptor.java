package cn.zsq.interceptor;


import cn.zsq.model.Users;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        /*
            调用时间：Controller方法处理之前
            执行顺序：链式Intercepter情况下，Intercepter按照声明的顺序一个接一个执行
            若返回false，则中断执行
         */
           HttpSession session = httpServletRequest.getSession();
           Users users = (Users) session.getAttribute("users");
           if(users==null){
               httpServletResponse.sendRedirect("/hrm/UsersController/recruitLoginShow.do");
               return  false;
           }
            return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        /*
           调用前提：preHandle返回true
           调用时间：Controller方法处理完之后，DispatcherServlet进行视图的渲染之前，
           也就是说在这个方法中你可以对ModelAndView进行操作
           执行顺序：链式Intercepter情况下，Intercepter按照声明的顺序倒着执行。
           ：postHandle虽然post打头，但post、get方法都能处理
         */

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
            /*
                调用前提：preHandle返回true
                调用时间：DispatcherServlet进行视图的渲染之后
                多用于清理资源
                */

    }
}
