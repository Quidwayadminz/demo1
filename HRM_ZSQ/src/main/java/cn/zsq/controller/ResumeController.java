package cn.zsq.controller;

import cn.zsq.model.Resume;
import cn.zsq.model.Users;
import cn.zsq.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("ResumeController")
public class ResumeController {
    @Resource
    private ResumeService resumeService;
    @RequestMapping(value = "resumeShow.do")
    public String resumeShow(Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        Users users = (Users) session.getAttribute("users");
        List<Resume> list =resumeService.getResumesByUid(users);
        model.addAttribute("list",list);
        return "resumeShow";
    }
    @RequestMapping(value = "addResume.do")
    public String addResumeShow(){
        return "addResume";
    }
}
