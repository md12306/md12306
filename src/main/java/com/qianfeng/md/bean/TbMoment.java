package com.qianfeng.md.bean;


import java.sql.Date;

public class TbMoment {

  private Integer momentId;
  private String startTime;
  private String momentWeek;
  private java.sql.Date startDate;

  public Integer getMomentId() {
    return momentId;
  }

  public void setMomentId(Integer momentId) {
    this.momentId = momentId;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getMomentWeek() {
    return momentWeek;
  }

  public void setMomentWeek(String momentWeek) {
    this.momentWeek = momentWeek;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  @Override
  public String toString() {
    return "TbMoment{" +
            "momentId=" + momentId +
            ", startTime='" + startTime + '\'' +
            ", momentWeek='" + momentWeek + '\'' +
            ", startDate=" + startDate +
            '}';
  }
}
