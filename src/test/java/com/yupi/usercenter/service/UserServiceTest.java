package com.yupi.usercenter.service;
import java.util.Date;

import com.yupi.usercenter.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void testAddUser() {
        User user = new User();
        user.setId(0L);
        user.setUserName("野种");
        user.setUserAccount("123");
        user.setAvatarUrl("www");
        user.setGender(0);
        user.setUserPassword("123");
        user.setPhone("123");
        user.setEmail("123@123");
        user.setUserStatus(0);
        user.setUserRole(0);
        user.setPlanetCode("1");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setIsDelete(0);

        userService.save(user);
    }

}