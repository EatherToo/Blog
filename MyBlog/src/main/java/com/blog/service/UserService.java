package com.blog.service;

import com.blog.entity.User;

public interface UserService {

    /**
     * 用户注册功能
     * @param  user Object of User
     * @return int
     */
    int regist(User user);

}
