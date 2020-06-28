package com.pig4cloud.spring.log.controller;

import com.pig4cloud.spring.log.config.DemoLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lengleng
 * @date 2020/6/27
 */
@RestController
public class DemoController {

    @DemoLog("测试方法")
    @GetMapping
    public String demo(String username) {
        return "hello " + username;
    }
}
