package com.pig4cloud.spring.aop.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lengleng
 * @date 2020/6/28
 */
@Slf4j
@Aspect
public class LogAop {
    @Autowired
    private HttpServletRequest request;

    @Around("execution(public * com.pig4cloud.spring.aop.controller.*Controller.*(..))")
    public Object around(JoinPoint point) throws Throwable {
        log.info("请求参数为:{}", point.getArgs());

        log.info("请求方法为:{}", point.getSignature().getName());

        // request context
        String header = request.getHeader("User-Agent");
        log.info("请求浏览器{}", header);
        ProceedingJoinPoint proceedingJoinPoint = (ProceedingJoinPoint) point;
        Object result = proceedingJoinPoint.proceed();

        log.info("处理结果为:{}", result);
        return result;
    }
}
