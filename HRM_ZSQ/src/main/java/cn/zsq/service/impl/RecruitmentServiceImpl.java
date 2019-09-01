package cn.zsq.service.impl;

import cn.zsq.dao.RecruitmentDao;
import cn.zsq.model.Recruitment;
import cn.zsq.service.RecruitmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecruitmentServiceImpl implements RecruitmentService {
    @Resource
    private RecruitmentDao recruitmentDao;

    @Override
    public List<Recruitment> getRecruitment() {
        return recruitmentDao.getRecruitments();
    }

}
