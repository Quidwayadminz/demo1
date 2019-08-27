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

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuAccount() {
        return uAccount;
    }

    public void setuAccount(String uAccount) {
        this.uAccount = uAccount;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    public Integer getuType() {
        return uType;
    }

    public void setuType(Integer uType) {
        this.uType = uType;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public List<Resume> getResumeList() {
        return resumeList;
    }

    public void setResumeList(List<Resume> resumeList) {
        this.resumeList = resumeList;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uId=" + uId +
                ", uAccount='" + uAccount + '\'' +
                ", uPass='" + uPass + '\'' +
                ", uType=" + uType +
                ", uPhone='" + uPhone + '\'' +
                ", resumeList=" + resumeList +
                '}';
    }
}
