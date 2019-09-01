package cn.zsq.model;


import java.sql.Timestamp;

/**
 * 招聘信息
 */
public class Recruitment {
    private Integer rmId;//招聘id
    private String rmPostName;//职位名称
    private Timestamp rmReleaseDate;//发布时间
    private Double rmSalary;//薪资
    private String rmWorkplace;//工作地点
    private String rmExperience;//工作经验
    private String rmEducation;// 学历

    public Integer getRmId() {
        return rmId;
    }

    public void setRmId(Integer rmId) {
        this.rmId = rmId;
    }

    public String getRmPostName() {
        return rmPostName;
    }

    public void setRmPostName(String rmPostName) {
        this.rmPostName = rmPostName;
    }

    public Timestamp getRmReleaseDate() {
        return rmReleaseDate;
    }

    public void setRmReleaseDate(Timestamp rmReleaseDate) {
        this.rmReleaseDate = rmReleaseDate;
    }

    public Double getRmSalary() {
        return rmSalary;
    }

    public void setRmSalary(Double rmSalary) {
        this.rmSalary = rmSalary;
    }

    public String getRmWorkplace() {
        return rmWorkplace;
    }

    public void setRmWorkplace(String rmWorkplace) {
        this.rmWorkplace = rmWorkplace;
    }

    public String getRmExperience() {
        return rmExperience;
    }

    public void setRmExperience(String rmExperience) {
        this.rmExperience = rmExperience;
    }

    public String getRmEducation() {
        return rmEducation;
    }

    public void setRmEducation(String rmEducation) {
        this.rmEducation = rmEducation;
    }

    @Override
    public String toString() {
        return "Recruitment{" +
                "rmId=" + rmId +
                ", rmPostName='" + rmPostName + '\'' +
                ", rmReleaseDate=" + rmReleaseDate +
                ", rmSalary=" + rmSalary +
                ", rmWorkplace='" + rmWorkplace + '\'' +
                ", rmExperience='" + rmExperience + '\'' +
                ", rmEducation='" + rmEducation + '\'' +
                '}';
    }
}
