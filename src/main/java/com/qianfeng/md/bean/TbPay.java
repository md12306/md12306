package com.qianfeng.md.bean;


public class TbPay {

  private Integer payId;
  private Integer userId;
  private Integer balance;

  public Integer getPayId() {
    return payId;
  }

  public void setPayId(Integer payId) {
    this.payId = payId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "TbPay{" +
            "payId=" + payId +
            ", userId=" + userId +
            ", balance=" + balance +
            '}';
  }
}
