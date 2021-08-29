package com.mao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer	
@SpringBootApplication
public class EruekeServer7002_App {
	public static void main(String[] args) {
		SpringApplication.run(EruekeServer7002_App.class, args);
	}
}
