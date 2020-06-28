package com.pig4cloud.spring.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lengleng
 * @date 2020/6/26
 */
@RestController
public class DemoController {

    @GetMapping("/")
    public String demo(){
        return "hello spring boot";
    }
}
