package com.blog.entity;

public class Role {
    private Long roleId;

    private String roleName;

    private String roleValue;

    private String roleUrl;

    private Boolean roleEnab;

    private String roleNote;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleValue() {
        return roleValue;
    }

    public void setRoleValue(String roleValue) {
        this.roleValue = roleValue == null ? null : roleValue.trim();
    }

    public String getRoleUrl() {
        return roleUrl;
    }

    public void setRoleUrl(String roleUrl) {
        this.roleUrl = roleUrl == null ? null : roleUrl.trim();
    }

    public Boolean getRoleEnab() {
        return roleEnab;
    }

    public void setRoleEnab(Boolean roleEnab) {
        this.roleEnab = roleEnab;
    }

    public String getRoleNote() {
        return roleNote;
    }

    public void setRoleNote(String roleNote) {
        this.roleNote = roleNote == null ? null : roleNote.trim();
    }
}