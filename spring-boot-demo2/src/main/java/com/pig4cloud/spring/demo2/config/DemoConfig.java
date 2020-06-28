package com.pig4cloud.spring.demo2.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author lengleng
 * @date 2020/6/27
 */
@Data
@Component
@ConfigurationProperties(prefix = "user")
public class DemoConfig {

    private String username;

    private String password;

    private Integer age;
}
