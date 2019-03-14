package com.blog.controller;

import com.blog.common.GetIdentityCode;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

@Controller
public class LoginController {

    private static Logger logger = Logger.getLogger(IndexController.class);

    private static GetIdentityCode getIdentityCode = new GetIdentityCode();

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
    

    /**
     * 获取验证码
     *
     */
    @RequestMapping(value = "getcode")
    @ResponseBody
    public void getCode(HttpSession session, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("image/jpeg");
        Map<String, Object> map = getIdentityCode.getCode();
        //将验证码保存到session中方便验证
        session.setAttribute("code", map.get("code"));
        //获取验证码图片
        BufferedImage img = (BufferedImage) map.get("img");
        ServletOutputStream out = response.getOutputStream();
        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
        encoder.encode(img);
        out.flush();



    }
}
