package cn.zsq.dao;

import cn.zsq.model.Recruitment;

import java.util.List;

public interface RecruitmentDao {
    List<Recruitment> getRecruitments();
        Recruitment getRecruitmentsByAny(Recruitment recruitment);
}
