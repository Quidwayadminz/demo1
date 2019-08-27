package cn.zsq.model;

import java.util.List;

/**
 * 员工
 */
public class Employee {
    private Integer eId;//员工 id
    private String eAccount;// 员工账号
    private String ePass;//员工密码
    private Personal personal;//一对一 个人信息
    private List<Training> trainingList;// 多对多 培训信息
}
