package cn.zsq.controller;

import cn.zsq.model.Users;
import cn.zsq.service.UsersService;
import cn.zsq.util.CodeUtil;
import cn.zsq.util.SCaptcha;
import cn.zsq.util.VerifyCodeUtils;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

import static cn.zsq.util.VerifyCodeUtils.generateVerifyCode;
import static cn.zsq.util.VerifyCodeUtils.outputImage;

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
        String code =CodeUtil.getCode(4);
        try {
            response.getWriter().write(code);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping(value = "getCodeImg.do")
    public void getCodeImg(String codeImg,HttpSession session,HttpServletResponse response){
        String  code = (String) session.getAttribute("CODE");
        System.out.println(code);
        System.out.println(codeImg);
        try {
            if(code.equalsIgnoreCase(codeImg)){
                response.getWriter().write("ok");
            }else{
                response.getWriter().write("图片验证失败！");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping(value = "registerUsers.do")
    public String registerUsers(Users users,Model model, HttpServletResponse response, HttpSession session){
            String account;
            if((account=usersService.registerUsers(users))!=null){
                model.addAttribute("account",account);
                return "succeed";
            }else{
                System.out.println("出错了！");
                return "";
            }
    }
    @RequestMapping(value = "loginUsers.do")
    public void loginUsers(Users users,HttpServletRequest request,HttpServletResponse response){
        Users users1 = usersService.loginUsers(users);
        if(users1!=null){
            request.getSession().setAttribute("users",users1);
            try {
                response.getWriter().write("ok");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try {
                response.getWriter().write("账号或密码错误！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @RequestMapping(value = "imageVerify.do")
    public void imageVerify(HttpServletRequest req,HttpServletResponse resp,HttpSession session){
        // 禁止图像缓存。
        resp.setHeader("Pragma", "No-cache");
        resp.setHeader("Cache-Control", "no-cache");
        resp.setDateHeader("Expires", 0);
        // 设置响应的类型格式为图片格式
        resp.setContentType("image/jpeg");
        //生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        //存入会话session
        req.getSession().setAttribute("CODE", verifyCode.toLowerCase());
        //生成图片
        int width = 120;//宽
        int height = 60;//高
        try {
            VerifyCodeUtils.outputImage(width, height, resp.getOutputStream(), verifyCode);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "imageVerify2.do")
    public void imageVerify2(HttpServletRequest request,HttpServletResponse response,HttpSession session){
        // 设置响应的类型格式为图片格式
        response.setContentType("image/jpeg");
        // 禁止图像缓存。
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        //实例生成验证码对象
        SCaptcha instance = new SCaptcha();
        //将验证码存入session
        session.setAttribute("verification", instance.getCode());
        //向页面输出验证码图片
        try {
            instance.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
