package cn.zsq.controller;

import cn.zsq.service.RecruitmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("RecruitmentController")
public class RecruitmentController {
    @Resource
    private RecruitmentService recruitmentService;

    @RequestMapping(value = "recruitmentShow.do")
    public String recruitmentShow(Model model){
        model.addAttribute("list",recruitmentService.getRecruitment());
        return "recruitment";
    }

}
