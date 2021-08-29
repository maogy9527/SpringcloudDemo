package com.mao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient  // eureka 客户端
@EnableCircuitBreaker // 熔断器主启动类注解
@SpringBootApplication
public class DeptProvider8001_Hystrix {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_Hystrix.class, args);
	}
}
