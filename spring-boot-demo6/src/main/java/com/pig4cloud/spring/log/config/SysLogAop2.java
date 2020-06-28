package com.pig4cloud.spring.log.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lengleng
 * @date 2020/6/27
 */
@Slf4j
@Aspect
@Component
public class SysLogAop2 {
    @Autowired
    private HttpServletRequest request;


    @Around("@annotation(demoLog)")
    public Object around(ProceedingJoinPoint point, DemoLog demoLog) throws Throwable {

        // 请求参数
        Object[] args = point.getArgs();
        log.info("请求参数为{}", args);

        // 请求IP
        String remoteAddr = request.getRemoteAddr();
        log.info("请求ip {}", remoteAddr);

        log.info("请求方法 {}", point.getSignature().getName());
        log.info("请求方法 {}", demoLog.value());
        Object result = point.proceed();

        log.info("返回值{}", result);
        return result;
    }
}
