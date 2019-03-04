package com.blog.dao;

import com.blog.entity.Comments;

public interface CommentsMapper {
    int deleteByPrimaryKey(Long comId);

    int insert(Comments record);

    int insertSelective(Comments record);

    Comments selectByPrimaryKey(Long comId);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKeyWithBLOBs(Comments record);

    int updateByPrimaryKey(Comments record);
}