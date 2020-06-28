package com.pig4cloud.spring.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SpringBootDemo4ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo4ServerApplication.class, args);
	}

}
