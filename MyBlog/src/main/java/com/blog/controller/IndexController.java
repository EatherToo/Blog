package com.blog.controller;

import com.blog.entity.User;
import com.blog.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;


@Controller
public class IndexController extends HttpServlet{

    @Autowired
    UserService userService;

    private static Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping(value = "/demo")
    public String demo(Model model){
        User user = new User();
        user.setUserNickname("Eve");
        logger.debug("插入新用户");
        userService.regist(user);
        String str = System.getProperty("webApp.root");
        model.addAttribute("message", str);
        return "demo/index";
    }

}
