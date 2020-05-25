package com.zyx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka_7001_App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Eureka_7001_App.class, args);
	}

}
