package com.blog.dao;

import com.blog.entity.Upvote;

public interface UpvoteMapper {
    int deleteByPrimaryKey(Long upuId);

    int insert(Upvote record);

    int insertSelective(Upvote record);

    Upvote selectByPrimaryKey(Long upuId);

    int updateByPrimaryKeySelective(Upvote record);

    int updateByPrimaryKey(Upvote record);
}