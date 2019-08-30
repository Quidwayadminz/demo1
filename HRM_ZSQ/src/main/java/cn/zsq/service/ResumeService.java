package cn.zsq.service;

import cn.zsq.model.Resume;
import cn.zsq.model.Users;

import java.util.List;

public interface ResumeService {
    List<Resume> getResumesByUid(Users users);
}
