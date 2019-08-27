package cn.zsq.controller;

import cn.zsq.service.UsersService;
import cn.zsq.util.CodeUtil;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("UsersController")
public class UsersController {
    @Resource
    private UsersService usersService;

    @RequestMapping(value = "recruitLoginShow.do")
    public String recruitLoginShow(){
        return "recruitLogin";
    }
    @RequestMapping(value = "recruitRegisterShow.do")
    public String recruitRegisterShow(){
        return "recruitRegister";
    }
    @RequestMapping(value = "getCode.do")
    public void getCode(HttpServletResponse response, HttpServletRequest request){
        String code =CodeUtil.getCode();
        try {
         HttpSession session = request.getSession();
         session.setAttribute("code",code);
            response.getWriter().write(code);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
