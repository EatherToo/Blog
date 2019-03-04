package com.blog.dao;

import com.blog.entity.RoleResource;

public interface RoleResourceMapper {
    int deleteByPrimaryKey(Long rrId);

    int insert(RoleResource record);

    int insertSelective(RoleResource record);

    RoleResource selectByPrimaryKey(Long rrId);

    int updateByPrimaryKeySelective(RoleResource record);

    int updateByPrimaryKey(RoleResource record);
}