package com.pig4cloud.spring.aop.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lengleng
 * @date 2020/6/28
 */
@Slf4j
@Aspect
@Component
public class LogAop2 {
    @Autowired
    private HttpServletRequest request;

    @Around("@annotation(demoLog)")
    public Object around(JoinPoint point, DemoLog demoLog) throws Throwable {
        log.info("请求参数为:{}", point.getArgs());

        log.info("请求方法为:{}", point.getSignature().getName());

        // request context
        String header = request.getHeader("User-Agent");
        log.info("请求浏览器{}", header);

        log.info("请求方法名称{}", demoLog.value());
        ProceedingJoinPoint proceedingJoinPoint = (ProceedingJoinPoint) point;
        Object result = proceedingJoinPoint.proceed();

        log.info("处理结果为:{}", result);
        return result;
    }
}
