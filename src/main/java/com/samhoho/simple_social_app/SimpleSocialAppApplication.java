package com.samhoho.simple_social_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SimpleSocialAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSocialAppApplication.class, args);
	}

}
