package cn.zsq.model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * 奖罚记录
 */
public class Awardanpunish {
    private Integer aapId;//奖罚记录id
    private Timestamp aapDate;//奖罚日期
    private Double aapMoney;//金额
    private String aapCause;// 奖罚原因
    private Employee employee;// 员工  一对一
}
