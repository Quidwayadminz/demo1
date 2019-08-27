package cn.zsq.model;

import java.util.Date;

/**
 * 考勤记录
 */
public class Attendancerecord {
   private Integer arId;//考勤记录id
   private Date arClockin;//上班打卡 date
   private Date arClockout;//下班打卡 date
   private String arCause;// 迟到原因
   private Checking_in checking_in;// 考勤规定 一对一


}
