package com.pig4cloud.spring.demo2;

import com.pig4cloud.spring.demo2.config.DemoConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemo2ApplicationTests {

    @Value("${user.username}")
    private String username;

    @Value("${user.password}")
    private String password;

    @Value("${user.age}")
    private Integer age;

    @Autowired
    private DemoConfig demoConfig;

    @Test
    void testUsername() {
        System.out.println(username);
        System.out.println(password);
        System.out.println(age);
    }

    @Test
    void testDemoConfig() {
        System.out.println(demoConfig);
    }
}
