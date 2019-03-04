package com.blog.dao;

import com.blog.entity.RoleUser;

public interface RoleUserMapper {
    int deleteByPrimaryKey(Long ruId);

    int insert(RoleUser record);

    int insertSelective(RoleUser record);

    RoleUser selectByPrimaryKey(Long ruId);

    int updateByPrimaryKeySelective(RoleUser record);

    int updateByPrimaryKey(RoleUser record);
}