package com.pig4cloud.spring.log.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lengleng
 * @date 2020/6/29
 */
@Slf4j
@Aspect
public class DemoLogAop {

    @Autowired
    private HttpServletRequest request;

    @Around("execution(public * com.pig4cloud.spring.log.demo.*Controller.*(..))")
    public Object around(JoinPoint point) throws Throwable {
        String ua = request.getHeader("User-Agent");
        log.info("请求浏览器:{}", ua);

        log.info("请求参数为:{}", point.getArgs());

        ProceedingJoinPoint proceedingJoinPoint = (ProceedingJoinPoint) point;

        Object result = proceedingJoinPoint.proceed();
        log.info("响应结果为:{}", result);
        return result;
    }
}
