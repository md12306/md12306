package com.qianfeng.md.vo;

/**
 * 热门路线的dto
 */
public class HotRouteVO {

    private Integer routeId;
    private String routeStart;
    private String routeEnd;
    private Integer hotNum;
    private String hotImg;
    private Integer ticketPrice;

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

    public String getHotImg() {
        return hotImg;
    }

    public void setHotImg(String hotImg) {
        this.hotImg = hotImg;
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "HotRouteVO{" +
                "routeId=" + routeId +
                ", routeStart='" + routeStart + '\'' +
                ", routeEnd='" + routeEnd + '\'' +
                ", hotNum=" + hotNum +
                ", hotImg='" + hotImg + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}