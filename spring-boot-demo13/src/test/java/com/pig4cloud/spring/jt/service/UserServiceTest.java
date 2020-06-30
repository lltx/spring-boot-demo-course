package com.pig4cloud.spring.jt.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lengleng
 * @date 2020/6/29
 */
@SpringBootTest
class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    void insert() {
        userService.insert("lengleng","password1234");
    }

    @Test
    void delete() {
        userService.delete(1);
    }

    @Test
    void update() {
        userService.update(1,"leng");
    }

    @Test
    void query() {
        System.out.println(userService.query(1));
    }
}
