package cn.zsq.model;

import java.util.Date;

/**
 * 工作经验
 */
public class Workexperience {
    private Integer weId;// 工作id
    private String weCompany_name;//公司名称
    private Integer weRuning_hour;// 工作经验时长
    private String weOccupation;//行业名称
    private String wePosition;//职位名称
    private Date weBegin_date;//在职时间
    private Date weEnd_date;//离职时间
    private Double weSalary;//税前工资
    private String weDescribe;//工作描述
    private Resume resume;//简历一对多
}
