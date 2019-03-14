package com.blog.common;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*** 这个类用来生成验证码
 * @author Eather
 * @version 1.0
 *
 */
public class GetIdentityCode {

    private static final char[] CHARS = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'}; //设置验证码字符
    private static Random random = new Random();//随机数对象

    /**
     * 获取随机字符串
     * @return String 返回随机字符串
     */
    private String getRandomCode(){
        StringBuilder builder = new StringBuilder();
        for(int i=1;i<=4;i++)
            builder.append(CHARS[random.nextInt(CHARS.length)]);
        return builder.toString();
    }

    //字体颜色设为背景颜色的反色
    private Color getReverseColor(Color c)
    {
        return new Color(255-c.getRed(), 255-c.getGreen(), 255-c.getBlue());
    }

    public Map<String, Object> getCode() {
        //获取随机字符串
        String randomString = getRandomCode();
        int width = 70;
        int height = 30;

        //背景颜色
        Color color = new Color(220, 220, 220);
        Color reverse = getReverseColor(color);

        //创建图片
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        //创建画笔
        Graphics2D g = bi.createGraphics();
        //设置字体
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        //设置画笔颜色
        g.setColor(color);
        //设置大小
        g.fillRect(0, 0, width, height);
        //重设画笔颜色
        g.setColor(reverse);
        g.drawString(randomString, 18, 20);
        for(int i=0,n=random.nextInt(100);i<n;i++)
            g.drawRect(random.nextInt(width), random.nextInt(height),1,1);

        Map<String, Object> map = new HashMap<>();
        map.put("code", randomString);
        map.put("img", bi);
        return map;

    }
}
