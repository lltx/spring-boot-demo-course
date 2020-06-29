package com.pig4cloud.spring.log.aop;

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
 * @date 2020/6/29
 */
@Slf4j
@Aspect
@Component
public class DemoLogAop2 {

    @Autowired
    private HttpServletRequest request;

    @Around("@annotation(demoLog)")
    public Object around(JoinPoint point,DemoLog demoLog) throws Throwable {
        String ua = request.getHeader("User-Agent");
        log.info("请求浏览器:{}", ua);

        log.info("请求参数为:{}", point.getArgs());

        log.info("请求方法为:{}", demoLog.value());
        ProceedingJoinPoint proceedingJoinPoint = (ProceedingJoinPoint) point;

        Object result = proceedingJoinPoint.proceed();
        log.info("响应结果为:{}", result);
        return result;
    }
}
