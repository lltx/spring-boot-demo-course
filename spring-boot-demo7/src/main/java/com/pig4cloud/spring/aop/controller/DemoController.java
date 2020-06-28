package com.pig4cloud.spring.aop.controller;

import com.pig4cloud.spring.aop.config.DemoLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lengleng
 * @date 2020/6/28
 */
@RestController
public class DemoController {

    @DemoLog("测试拦截")
    @GetMapping
    public String demo(String username) {
        return "hello " + username;
    }
}
