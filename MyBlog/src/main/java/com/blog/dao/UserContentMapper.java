package com.blog.dao;

import com.blog.entity.UserContent;

public interface UserContentMapper {
    int deleteByPrimaryKey(Long conId);

    int insert(UserContent record);

    int insertSelective(UserContent record);

    UserContent selectByPrimaryKey(Long conId);

    int updateByPrimaryKeySelective(UserContent record);

    int updateByPrimaryKeyWithBLOBs(UserContent record);

    int updateByPrimaryKey(UserContent record);
}