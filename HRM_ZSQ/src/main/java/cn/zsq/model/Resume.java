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
    private List<Workexperience> workexperienceList;//工作经验一对多
    private Professionalskill professionalskill;//专业技能一对一
    private Education education;//教育 一对一
}
