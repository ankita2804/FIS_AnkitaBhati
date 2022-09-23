package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(value="com.example.demo.service")
public class FisAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisAppApplication.class, args);
	}

	

}
