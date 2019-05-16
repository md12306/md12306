package com.qianfeng.md.bean;


public class TbStation {

  private Integer stationId;
  private String stationName;
  private String stationAddress;
  private String stationTel;
  private String stationPic;
  private String stationUrl;
  private String province;

  public Integer getStationId() {
    return stationId;
  }

  public void setStationId(Integer stationId) {
    this.stationId = stationId;
  }

  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }


  public String getStationAddress() {
    return stationAddress;
  }

  public void setStationAddress(String stationAddress) {
    this.stationAddress = stationAddress;
  }


  public String getStationTel() {
    return stationTel;
  }

  public void setStationTel(String stationTel) {
    this.stationTel = stationTel;
  }


  public String getStationPic() {
    return stationPic;
  }

  public void setStationPic(String stationPic) {
    this.stationPic = stationPic;
  }


  public String getStationUrl() {
    return stationUrl;
  }

  public void setStationUrl(String stationUrl) {
    this.stationUrl = stationUrl;
  }


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  @Override
  public String toString() {
    return "TbStation{" +
            "stationId=" + stationId +
            ", stationName='" + stationName + '\'' +
            ", stationAddress='" + stationAddress + '\'' +
            ", stationTel='" + stationTel + '\'' +
            ", stationPic='" + stationPic + '\'' +
            ", stationUrl='" + stationUrl + '\'' +
            ", province='" + province + '\'' +
            '}';
  }
}
