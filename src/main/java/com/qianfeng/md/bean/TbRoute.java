package com.qianfeng.md.bean;


public class TbRoute {

  private long routeId;
  private String routeStart;
  private String routeEnd;
  private long hotNum;
  private String hotImg;
  private long routeDistance;


  public long getRouteId() {
    return routeId;
  }

  public void setRouteId(long routeId) {
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


  public long getHotNum() {
    return hotNum;
  }

  public void setHotNum(long hotNum) {
    this.hotNum = hotNum;
  }


  public String getHotImg() {
    return hotImg;
  }

  public void setHotImg(String hotImg) {
    this.hotImg = hotImg;
  }


  public long getRouteDistance() {
    return routeDistance;
  }

  public void setRouteDistance(long routeDistance) {
    this.routeDistance = routeDistance;
  }

}
