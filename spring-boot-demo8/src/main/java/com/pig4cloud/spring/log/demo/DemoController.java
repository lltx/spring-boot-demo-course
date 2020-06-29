package com.pig4cloud.spring.log.demo;

import com.pig4cloud.spring.log.aop.DemoLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lengleng
 * @date 2020/6/29
 */
@RestController
public class DemoController {

    @DemoLog("测试方法")
    @GetMapping
    public String demo(String username) {
        return "hello " + username;
    }
}
