package cn.zsq.model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * 考勤记录
 */
public class Attendancerecord {
   private Integer arId;//考勤记录id
   private Timestamp arClockin;//上班打卡 date
   private Timestamp arClockout;//下班打卡 date
   private String arCause;// 迟到原因
   private Checking_in checking_in;// 考勤规定 一对一


}
