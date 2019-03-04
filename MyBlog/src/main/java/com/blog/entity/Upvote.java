package com.blog.entity;

import java.util.Date;

public class Upvote {
    private Long upuId;

    private Long userId;

    private String userIp;

    private Boolean upvState;

    private Date upvTime;

    public Long getUpuId() {
        return upuId;
    }

    public void setUpuId(Long upuId) {
        this.upuId = upuId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    public Boolean getUpvState() {
        return upvState;
    }

    public void setUpvState(Boolean upvState) {
        this.upvState = upvState;
    }

    public Date getUpvTime() {
        return upvTime;
    }

    public void setUpvTime(Date upvTime) {
        this.upvTime = upvTime;
    }
}