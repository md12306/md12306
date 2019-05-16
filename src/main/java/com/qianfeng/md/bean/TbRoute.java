package com.qianfeng.md.bean;


public class TbRoute {

  private Integer routeId;
  private String routeStart;
  private String routeEnd;
  private Integer hotNum;

  public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
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

  public Integer getHotNum() {
    return hotNum;
  }

  public void setHotNum(Integer hotNum) {
    this.hotNum = hotNum;
  }

  @Override
  public String toString() {
    return "TbRoute{" +
            "routeId=" + routeId +
            ", routeStart='" + routeStart + '\'' +
            ", routeEnd='" + routeEnd + '\'' +
            ", hotNum=" + hotNum +
            '}';
  }
}
