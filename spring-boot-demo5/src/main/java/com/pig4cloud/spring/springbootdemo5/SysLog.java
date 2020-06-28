package com.pig4cloud.spring.springbootdemo5;

import java.lang.annotation.*;

/**
 * @author lengleng
 * @date 2020/6/27
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {
}
