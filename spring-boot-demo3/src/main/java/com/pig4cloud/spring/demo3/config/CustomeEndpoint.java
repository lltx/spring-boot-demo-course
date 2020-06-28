package com.pig4cloud.spring.demo3.config;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/**
 * @author lengleng
 * @date 2020/6/27
 */
@Component
@Endpoint(id = "customEndppint")
public class CustomeEndpoint {

    @ReadOperation
    public String custome() {
        //
        return "helloworld";
    }
}
