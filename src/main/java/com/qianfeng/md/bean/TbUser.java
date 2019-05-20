package com.qianfeng.md.bean;


public class TbUser {

  private Integer userId;
  private Integer payId;
  private String username;
  private String userIdentity;
  private String userTel;
  private String email;
  private String role;
  private String password;

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getPayId() {
    return payId;
  }

  public void setPayId(Integer payId) {
    this.payId = payId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUserIdentity() {
    return userIdentity;
  }

  public void setUserIdentity(String userIdentity) {
    this.userIdentity = userIdentity;
  }

  public String getUserTel() {
    return userTel;
  }

  public void setUserTel(String userTel) {
    this.userTel = userTel;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "TbUser{" +
            "userId=" + userId +
            ", payId=" + payId +
            ", username='" + username + '\'' +
            ", userIdentity='" + userIdentity + '\'' +
            ", userTel='" + userTel + '\'' +
            ", email='" + email + '\'' +
            ", role='" + role + '\'' +
            ", password='" + password + '\'' +
            '}';
  }
}
