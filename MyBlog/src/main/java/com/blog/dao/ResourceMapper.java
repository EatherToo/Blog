package com.blog.dao;

import com.blog.entity.Resource;

public interface ResourceMapper {
    int deleteByPrimaryKey(Long resId);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Long resId);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}