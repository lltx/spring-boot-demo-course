package com.pig4cloud.spring.log.aop;

import java.lang.annotation.*;

/**
 * @author lengleng
 * @date 2020/6/29
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface DemoLog {

    String value();
}
