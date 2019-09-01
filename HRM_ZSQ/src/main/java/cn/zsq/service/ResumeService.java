package cn.zsq.service;

import cn.zsq.model.Recruitment;
import cn.zsq.model.Resume;
import cn.zsq.model.Users;

import java.util.List;

public interface ResumeService {
    List<Resume> getResumesByUid(Users users);
    boolean addResumes(Resume resume,Users users);
    boolean deleteResume(Integer id);
    boolean updateResume(Resume resume,Users users);
    Recruitment getRecruitmentsByrmId(Integer id);
}
