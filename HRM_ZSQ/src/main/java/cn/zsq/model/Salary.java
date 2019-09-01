package cn.zsq.model;

import java.sql.Date;

/**
 * 薪资
 */
public class Salary {
    private Integer sId;// 薪资id
    private Double sMoney;//基本薪资
    private Double sBonus;//奖金金额
    private Double sOvertime;//加班费
    private Double sSocial_security;//社保
    private Date sDate;//工资日期
    private Integer sState;//状态 1.已确认  2.未确认 3.复议 4.审核 5.补发(下月补发)
    private String sCause;//复议原因
    private Double sReissue;//补发金额
    private Awardanpunish awardanpunish;// 奖罚信息 一对一
}
