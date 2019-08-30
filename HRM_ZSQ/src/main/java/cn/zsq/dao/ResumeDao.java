package cn.zsq.dao;

import cn.zsq.model.Resume;
import cn.zsq.model.Users;

import java.util.List;

public interface ResumeDao {
    List<Resume> getResumesByUid(Users users);
}
