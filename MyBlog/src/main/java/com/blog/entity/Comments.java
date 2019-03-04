package com.blog.entity;

import java.util.Date;

public class Comments {
    private Long comId;

    private Long conId;

    private Long userId;

    private Date comTime;

    private String comSubid;

    private Integer comUpvote;

    private String comText;

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

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

    public Date getComTime() {
        return comTime;
    }

    public void setComTime(Date comTime) {
        this.comTime = comTime;
    }

    public String getComSubid() {
        return comSubid;
    }

    public void setComSubid(String comSubid) {
        this.comSubid = comSubid == null ? null : comSubid.trim();
    }

    public Integer getComUpvote() {
        return comUpvote;
    }

    public void setComUpvote(Integer comUpvote) {
        this.comUpvote = comUpvote;
    }

    public String getComText() {
        return comText;
    }

    public void setComText(String comText) {
        this.comText = comText == null ? null : comText.trim();
    }
}