package com.blog.dao;

import com.blog.entity.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Long uiId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long uiId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}