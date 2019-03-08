package test.blog;

import com.blog.entity.User;
import com.blog.service.UserService;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:springMVC-servlet.xml"})
public class Test extends AbstractJUnit4SpringContextTests {
    @Autowired
    UserService userService;

    private static Logger logger = Logger.getLogger(Test.class);

    /**
     * 单元测试
     */
    @org.junit.Test
    public void testSave(){
        User user = new User();
        user.setUserNickname("Eve");
        userService.regist(user);
    }

}
