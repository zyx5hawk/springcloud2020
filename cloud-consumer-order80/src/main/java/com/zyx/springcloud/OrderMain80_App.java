package com.zyx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderMain80_App {

	public static void main(String[] args) {
		SpringApplication.run(OrderMain80_App.class, args);
	}

}
