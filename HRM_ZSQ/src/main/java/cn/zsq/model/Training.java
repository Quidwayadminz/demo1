package cn.zsq.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * 培训信息
 */
public class Training {
    private Integer tId;//培训id
    private String tTheme;//培训主题
    private String tContent;//具体内容
    private Timestamp tStartDate;//开始时间
    private Timestamp tEndDate;//结束时间
    private String tSite;//地点
    private List<Employee> employeeList;//员工 多对多
}
