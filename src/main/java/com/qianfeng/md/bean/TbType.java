package com.qianfeng.md.bean;


public class TbType {

  private Integer typeId;
  private String typeName;
  private Integer typeSeatNum;
  private String seatTable;


  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public Integer getTypeSeatNum() {
    return typeSeatNum;
  }

  public void setTypeSeatNum(Integer typeSeatNum) {
    this.typeSeatNum = typeSeatNum;
  }

  public String getSeatTable() {
    return seatTable;
  }

  public void setSeatTable(String seatTable) {
    this.seatTable = seatTable;
  }

  @Override
  public String toString() {
    return "TbType{" +
            "typeId=" + typeId +
            ", typeName='" + typeName + '\'' +
            ", typeSeatNum=" + typeSeatNum +
            ", seatTable='" + seatTable + '\'' +
            '}';
  }
}
