package com.blog.service;

import com.blog.entity.User;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {

    /**
     * 用户注册功能
     * @param user
     * @return
     */
    int regist(User user);

    void test();
}
