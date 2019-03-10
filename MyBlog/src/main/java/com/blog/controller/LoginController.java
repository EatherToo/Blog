package com.blog.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    private static Logger logger = Logger.getLogger(IndexController.class);

    /**
     *
     * @param model 模型对象
     * @return sighin 视图名称
     */
    @RequestMapping(value = "sighin")
    public String sighin(Model model){
        model.addAttribute("message", "注册页面");
        return "sighin";
    }
}
