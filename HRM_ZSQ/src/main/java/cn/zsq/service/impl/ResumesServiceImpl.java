package cn.zsq.service.impl;

import cn.zsq.dao.RecruitmentDao;
import cn.zsq.dao.ResumeDao;
import cn.zsq.model.Recruitment;
import cn.zsq.model.Resume;
import cn.zsq.model.Users;
import cn.zsq.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
@Service
public class ResumesServiceImpl implements ResumeService {
    @Resource
    private ResumeDao resumeDao;
    @Resource
    private RecruitmentDao recruitmentDao;
    @Override
    public List<Resume> getResumesByUid(Users users) {
        if(users.getuId()==null)return null;
        return resumeDao.getResumesByUid(users);
    }

    @Override
    public boolean addResumes(Resume resume,Users users) {
        if(resume.getrBirthdate()==null || resume.getrName()==null||
        resume.getrSex()==null || resume.getrCurrentAddress() == null||
        resume.getrDomicilePlace()==null || resume.getrPhoneNumber() == null
        || resume.getrMaritalStatus()==null || resume.getrEmail() == null
        || resume.getrEducationName() == null || resume.getrWorkexperience() == null
        || resume.getrProfessionalskill() == null) return false;
        resume.setrUpdateDate(new Timestamp(new Date().getTime()));
        resume.setUsers(users);
        resume.setrState(1);
        return  resumeDao.addResumes(resume);
    }

    @Override
    public boolean deleteResume(Integer id) {
        if(id==null)return false;
        Resume resume = new Resume();
        resume.setrId(id);
        return resumeDao.deleteResume(resume);
    }

    @Override
    public boolean updateResume(Resume resume,Users users) {
        if(resume.getrBirthdate()==null || resume.getrName()==null||
                resume.getrSex()==null || resume.getrCurrentAddress() == null||
                resume.getrDomicilePlace()==null || resume.getrPhoneNumber() == null
                || resume.getrMaritalStatus()==null || resume.getrEmail() == null
                || resume.getrEducationName() == null || resume.getrWorkexperience() == null
                || resume.getrProfessionalskill() == null) return false;
        resume.setUsers(users);
        return resumeDao.updateResume(resume);
    }

    @Override
    public Recruitment getRecruitmentsByrmId(Integer id) {
        if(id==null)return null;
        Recruitment recruitment = new Recruitment();
        recruitment.setRmId(id);
        return recruitmentDao.getRecruitmentsByAny(recruitment);
    }
}
