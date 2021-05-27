package com.oxygen;

import com.oxygen.entity.User;
import com.oxygen.mapper.UserMapper;
import com.oxygen.service.UserService;
import com.oxygen.util.MD5Utils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Oxygen
 * @date: 2021/5/24 20:16
 * @purpose: 数据库连接测试类
 */
@SpringBootTest
class UserMapperTest {

    @Resource
    UserService userService;

    @Test
    public void test1() {
        List<User> userList = userService.list();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    /**
     * 测试增加数据
     */
    @Test
    public void test2() {
        User user  = new User();
        user.setNickname("王五");user.setUsername("123456");user.setPassword("1234678");
        userService.save(user);
        System.out.println(user);
    }

}