package com.blog.entity;

public class User {
    private Long userId;

    private String userEmail;

    private String userPassword;

    private String userPhone;

    private String userNickname;

    private Boolean userState;

    private String userImg;

    private Boolean userEnable;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public Boolean getUserState() {
        return userState;
    }

    public void setUserState(Boolean userState) {
        this.userState = userState;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    public Boolean getUserEnable() {
        return userEnable;
    }

    public void setUserEnable(Boolean userEnable) {
        this.userEnable = userEnable;
    }
}