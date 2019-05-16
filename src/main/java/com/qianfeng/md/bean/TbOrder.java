package com.qianfeng.md.bean;


import java.sql.Date;

public class TbOrder {

  private Integer orderId;
  private Integer userId;
  private String orderNum;
  private String startStation;
  private String endStation;
  private java.sql.Date startTime;
  private String carType;
  private String orderStatus;
  private String carnum;
  private Integer count;

  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getOrderNum() {
    return orderNum;
  }

  public void setOrderNum(String orderNum) {
    this.orderNum = orderNum;
  }

  public String getStartStation() {
    return startStation;
  }

  public void setStartStation(String startStation) {
    this.startStation = startStation;
  }

  public String getEndStation() {
    return endStation;
  }

  public void setEndStation(String endStation) {
    this.endStation = endStation;
  }

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public String getCarType() {
    return carType;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }

  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public String getCarnum() {
    return carnum;
  }

  public void setCarnum(String carnum) {
    this.carnum = carnum;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  @Override
  public String toString() {
    return "TbOrder{" +
            "orderId=" + orderId +
            ", userId=" + userId +
            ", orderNum='" + orderNum + '\'' +
            ", startStation='" + startStation + '\'' +
            ", endStation='" + endStation + '\'' +
            ", startTime=" + startTime +
            ", carType='" + carType + '\'' +
            ", orderStatus='" + orderStatus + '\'' +
            ", carnum='" + carnum + '\'' +
            ", count=" + count +
            '}';
  }
}
