package com.pig4cloud.spring.demo3.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 自定义 HealthIndicator
 *
 * @author lengleng
 * @date 2020/6/27
 */
@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        // http 调用远程接口 不通
        return Health.down().build();
    }
}
