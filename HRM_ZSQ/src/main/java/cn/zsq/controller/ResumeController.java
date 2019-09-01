package cn.zsq.controller;

import cn.zsq.model.Recruitment;
import cn.zsq.model.Resume;
import cn.zsq.model.Users;
import cn.zsq.service.ResumeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
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

    @RequestMapping(value = "addResumeShow.do")
    public String addResumeShow(){
        return "addResume";
    }

    @RequestMapping(value="addByUidResume.do")
    public void addResume(Resume resume, HttpServletResponse response,HttpSession session){
        Users users = (Users) session.getAttribute("users");
        System.out.println(resume);
          try {
            if(resumeService.addResumes(resume,users)){
                response.getWriter().write("ok");
            }else{
                response.getWriter().write("出错了！");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping(value = "removeResume.do")
    public void removeResume(Integer id,HttpServletResponse response,HttpServletRequest request){
                try {
                    if(resumeService.deleteResume(id)){
                         response.getWriter().write("ok");
                    }else{
                        response.getWriter().write("出错了，删除失败！");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

    }
    @RequestMapping(value = "updateByUidAndRidResume.do")
    public void updateByUidAndRidResume(Resume resume,HttpServletResponse response,HttpSession session){
        Users users = (Users)session.getAttribute("users");
        try {
            if(resumeService.updateResume(resume,users)){
                response.getWriter().write("ok");
            }else{
                response.getWriter().write("出错了！");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping(value = "resumeDeliver.do")
    public String resumeDeliver(Integer rmId,Model model,HttpSession session){
        Users users = (Users)session.getAttribute("users");
        List<Resume> list =resumeService.getResumesByUid(users);
        model.addAttribute("list",list);
        Recruitment recruitment = resumeService.getRecruitmentsByrmId(rmId);
        System.out.println(recruitment);
        model.addAttribute("recruitment",recruitment);
        return "resumeShow";
    }

}
