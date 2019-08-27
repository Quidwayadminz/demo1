package cn.zsq.controller;

import cn.zsq.model.Users;
import cn.zsq.service.UsersService;
import cn.zsq.util.CodeUtil;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletException;
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
        String code =CodeUtil.getCode(4);
        try {
            response.getWriter().write(code);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping(value = "registerUsers.do")
    public String registerUsers(Users users, Model model, HttpServletResponse response){
        String account;
        if((account=usersService.registerUsers(users))!=null){
            model.addAttribute("account",account);
            return "succeed";
        }else{
            System.out.println("出错了！");
            return "";
        }
    }
}
