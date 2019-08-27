package cn.zsq.model;

import java.util.Date;

/**
 * 教育经历
 */
public class Education {
    private Integer eId;// 教育id
    private String eNames;//校名
    private Date eStudying_date;// 入学时间
    private Date eDate_closed;// 毕业时间
    private String eSpecialty;// 所学专业
    private String eEducation_name;//学历
    private Resume resume;//简历一对一
}
