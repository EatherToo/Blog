package com.blog.entity;

import java.util.Date;

public class UserContent {
    private Long conId;

    private Long userId;

    private String conTitle;

    private String conCate;

    private Boolean conPrivacy;

    private Date conTime;

    private String userImg;

    private String userName;

    private String conContent;

    public Long getConId() {
        return conId;
    }

    public void setConId(Long conId) {
        this.conId = conId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getConTitle() {
        return conTitle;
    }

    public void setConTitle(String conTitle) {
        this.conTitle = conTitle == null ? null : conTitle.trim();
    }

    public String getConCate() {
        return conCate;
    }

    public void setConCate(String conCate) {
        this.conCate = conCate == null ? null : conCate.trim();
    }

    public Boolean getConPrivacy() {
        return conPrivacy;
    }

    public void setConPrivacy(Boolean conPrivacy) {
        this.conPrivacy = conPrivacy;
    }

    public Date getConTime() {
        return conTime;
    }

    public void setConTime(Date conTime) {
        this.conTime = conTime;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getConContent() {
        return conContent;
    }

    public void setConContent(String conContent) {
        this.conContent = conContent == null ? null : conContent.trim();
    }
}