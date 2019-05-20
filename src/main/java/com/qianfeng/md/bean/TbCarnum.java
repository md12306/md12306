package com.qianfeng.md.bean;


public class TbCarnum {

  private Integer carnumId;
  private Integer routeId;
  private Integer typeId;
  private Integer stationId;
  private Integer momentId;
  private String driverName;
  private String driverTel;
  private String carnum;
  private String carnumType;
  private Integer ticketPrice;
  private String carpai;

  @Override
  public String toString() {
    return "TbCarnum{" +
            "carnumId=" + carnumId +
            ", routeId=" + routeId +
            ", typeId=" + typeId +
            ", stationId=" + stationId +
            ", momentId=" + momentId +
            ", driverName='" + driverName + '\'' +
            ", driverTel='" + driverTel + '\'' +
            ", carnum='" + carnum + '\'' +
            ", carnumType='" + carnumType + '\'' +
            ", ticketPrice=" + ticketPrice +
            ", carpai='" + carpai + '\'' +
            '}';
  }

  public Integer getCarnumId() {
    return carnumId;
  }

  public void setCarnumId(Integer carnumId) {
    this.carnumId = carnumId;
  }

  public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public Integer getStationId() {
    return stationId;
  }

  public void setStationId(Integer stationId) {
    this.stationId = stationId;
  }

  public Integer getMomentId() {
    return momentId;
  }

  public void setMomentId(Integer momentId) {
    this.momentId = momentId;
  }

  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public String getDriverTel() {
    return driverTel;
  }

  public void setDriverTel(String driverTel) {
    this.driverTel = driverTel;
  }

  public String getCarnum() {
    return carnum;
  }

  public void setCarnum(String carnum) {
    this.carnum = carnum;
  }

  public String getCarnumType() {
    return carnumType;
  }

  public void setCarnumType(String carnumType) {
    this.carnumType = carnumType;
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
}
