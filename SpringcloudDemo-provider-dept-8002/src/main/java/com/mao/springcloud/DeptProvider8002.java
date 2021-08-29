package com.mao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient  // eureka 客户端,
@EnableDiscoveryClient
@SpringBootApplication
public class DeptProvider8002 {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8002.class, args);
	}
}
