package com.blog.entity;

public class Resource {
    private Long resId;

    private String resName;

    private String resUrl;

    private Boolean resEnable;

    private String resComment;

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName == null ? null : resName.trim();
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl == null ? null : resUrl.trim();
    }

    public Boolean getResEnable() {
        return resEnable;
    }

    public void setResEnable(Boolean resEnable) {
        this.resEnable = resEnable;
    }

    public String getResComment() {
        return resComment;
    }

    public void setResComment(String resComment) {
        this.resComment = resComment == null ? null : resComment.trim();
    }
}