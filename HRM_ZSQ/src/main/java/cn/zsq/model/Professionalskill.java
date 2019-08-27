package cn.zsq.model;

/**
 * 专业信息
 */
public class Professionalskill {
    private Integer paId;//专业id
    private String paName;//技能名称
    private Integer paDuration;//使用时长(月为单位)
    private Integer paDegree;//掌握程度
    private Resume resume;//简历一对一
}
