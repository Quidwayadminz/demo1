package cn.zsq.model;


import java.util.Date;
import java.util.List;


/**
 * 简历类
 */
public class Resume {
    private Integer rId;//简历id
    private String rName;//姓名
    private String rSex;//性别
    private Date rBirthdate;//出生日期
    private String rDomicilePlace;//户口所在地
    private String rCurrentAddress;//现住地址
    private String rPhoneNumber;//手机号码
    private String rEmail;//邮箱
    private Integer rMaritalStatus;//婚姻状况
    private Date rUpdateDate;//上次修改时间
    private Users users;//用户 一对多关系
    private String rEducationName;//学历
    private String rWorkexperience ;//工作经验
    private String rProfessionalskill;//专业技能
    private Integer rState;//状态 1 表示用户简历  2表示已经投出简历 3.已查看 4.通知面试

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrSex() {
        return rSex;
    }

    public void setrSex(String rSex) {
        this.rSex = rSex;
    }

    public Date getrBirthdate() {
        return rBirthdate;
    }

    public void setrBirthdate(Date rBirthdate) {
        this.rBirthdate = rBirthdate;
    }

    public String getrDomicilePlace() {
        return rDomicilePlace;
    }

    public void setrDomicilePlace(String rDomicilePlace) {
        this.rDomicilePlace = rDomicilePlace;
    }

    public String getrCurrentAddress() {
        return rCurrentAddress;
    }

    public void setrCurrentAddress(String rCurrentAddress) {
        this.rCurrentAddress = rCurrentAddress;
    }

    public String getrPhoneNumber() {
        return rPhoneNumber;
    }

    public void setrPhoneNumber(String rPhoneNumber) {
        this.rPhoneNumber = rPhoneNumber;
    }

    public String getrEmail() {
        return rEmail;
    }

    public void setrEmail(String rEmail) {
        this.rEmail = rEmail;
    }

    public Integer getrMaritalStatus() {
        return rMaritalStatus;
    }

    public void setrMaritalStatus(Integer rMaritalStatus) {
        this.rMaritalStatus = rMaritalStatus;
    }

    public Date getrUpdateDate() {
        return rUpdateDate;
    }

    public void setrUpdateDate(Date rUpdateDate) {
        this.rUpdateDate = rUpdateDate;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getrEducationName() {
        return rEducationName;
    }

    public void setrEducationName(String rEducationName) {
        this.rEducationName = rEducationName;
    }

    public String getrWorkexperience() {
        return rWorkexperience;
    }

    public void setrWorkexperience(String rWorkexperience) {
        this.rWorkexperience = rWorkexperience;
    }

    public String getrProfessionalskill() {
        return rProfessionalskill;
    }

    public void setrProfessionalskill(String rProfessionalskill) {
        this.rProfessionalskill = rProfessionalskill;
    }

    public Integer getrState() {
        return rState;
    }

    public void setrState(Integer rState) {
        this.rState = rState;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                ", rSex='" + rSex + '\'' +
                ", rBirthdate=" + rBirthdate +
                ", rDomicilePlace='" + rDomicilePlace + '\'' +
                ", rCurrentAddress='" + rCurrentAddress + '\'' +
                ", rPhoneNumber='" + rPhoneNumber + '\'' +
                ", rEmail='" + rEmail + '\'' +
                ", rMaritalStatus=" + rMaritalStatus +
                ", rUpdateDate=" + rUpdateDate +
                ", users=" + users +
                ", rEducationName='" + rEducationName + '\'' +
                ", rWorkexperience='" + rWorkexperience + '\'' +
                ", rProfessionalskill='" + rProfessionalskill + '\'' +
                ", rState=" + rState +
                '}';
    }
}
