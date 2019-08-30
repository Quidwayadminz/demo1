package cn.zsq.service.impl;

import cn.zsq.dao.ResumeDao;
import cn.zsq.model.Resume;
import cn.zsq.model.Users;
import cn.zsq.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ResumesServiceImpl implements ResumeService {
    @Resource
    private ResumeDao resumeDao;
    @Override
    public List<Resume> getResumesByUid(Users users) {
        if(users.getuId()==null)return null;
        return resumeDao.getResumesByUid(users);
    }
}
