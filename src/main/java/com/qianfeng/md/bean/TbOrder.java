package com.qianfeng.md.bean;


public class TbOrder {

  private Integer orderId;
  private Integer userId;
  private String orderNum;
  private String routeStart;
  private String routeEnd;
  private String momentWeek;
  private String startDate;
  private String startTime;
  private String carType;
  private String orderStatus;
  private String carnumType;
  private String carnum;
  private String orderTime;
  private String orderType;
  private String stationName;
  private String typeName;
  private Integer ticketPrice;
  private String carpai;
  private Integer typeSeatNum;
  private Integer carnumId;

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

  public String getRouteStart() {
    return routeStart;
  }

  public void setRouteStart(String routeStart) {
    this.routeStart = routeStart;
  }

  public String getRouteEnd() {
    return routeEnd;
  }

  public void setRouteEnd(String routeEnd) {
    this.routeEnd = routeEnd;
  }

  public String getMomentWeek() {
    return momentWeek;
  }

  public void setMomentWeek(String momentWeek) {
    this.momentWeek = momentWeek;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
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

  public String getCarnumType() {
    return carnumType;
  }

  public void setCarnumType(String carnumType) {
    this.carnumType = carnumType;
  }

  public String getCarnum() {
    return carnum;
  }

  public void setCarnum(String carnum) {
    this.carnum = carnum;
  }

  public String getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(String orderTime) {
    this.orderTime = orderTime;
  }

  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public Integer getTicketPrice() {
    return ticketPrice;
  }

  public void setTicketPrice(Integer ticketPrice) {
    this.ticketPrice = ticketPrice;
  }

  public String getCarpai() {
    return carpai;
  }

  public void setCarpai(String carpai) {
    this.carpai = carpai;
  }

  public Integer getTypeSeatNum() {
    return typeSeatNum;
  }

  public void setTypeSeatNum(Integer typeSeatNum) {
    this.typeSeatNum = typeSeatNum;
  }

  public Integer getCarnumId() {
    return carnumId;
  }

  public void setCarnumId(Integer carnumId) {
    this.carnumId = carnumId;
  }

  @Override
  public String toString() {
    return "TbOrder{" +
            "orderId=" + orderId +
            ", userId=" + userId +
            ", orderNum='" + orderNum + '\'' +
            ", routeStart='" + routeStart + '\'' +
            ", routeEnd='" + routeEnd + '\'' +
            ", momentWeek='" + momentWeek + '\'' +
            ", startDate='" + startDate + '\'' +
            ", startTime='" + startTime + '\'' +
            ", carType='" + carType + '\'' +
            ", orderStatus='" + orderStatus + '\'' +
            ", carnumType='" + carnumType + '\'' +
            ", carnum='" + carnum + '\'' +
            ", orderTime='" + orderTime + '\'' +
            ", orderType='" + orderType + '\'' +
            ", stationName='" + stationName + '\'' +
            ", typeName='" + typeName + '\'' +
            ", ticketPrice=" + ticketPrice +
            ", carpai='" + carpai + '\'' +
            ", typeSeatNum=" + typeSeatNum +
            ", carnumId=" + carnumId +
            '}';
  }
}
