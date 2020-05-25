package com.zyx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeign_80_App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(OpenFeign_80_App.class, args);
	}
}
