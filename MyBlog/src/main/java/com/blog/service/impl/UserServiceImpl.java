package com.blog.service.impl;

import com.blog.dao.UserMapper;
import com.blog.entity.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户注册功能
     * @param  user Object of User
     *
     * @see UserMapper#insert(User) 往数据库中插入User对象
     *
     * @return int
     */
    @Transactional//事务配置
    @Override
    public int regist(User user) {
        int i = userMapper.insert(user);
        return i;
    }

}
