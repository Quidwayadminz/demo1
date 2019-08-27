package cn.zsq.model;


import java.util.List;

/**
 * 用户表
 */
public class Users {
    private Integer uId;//用户id
    private String uAccount;//用户账号
    private String uPass;//用户密码
    private Integer uType;//用户类型 1.普通用户 2.管理员
    private String uPhone;//手机
    private List<Resume> resumeList;//简历一对多
}
