package com.mao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.mao.myrule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
// 在启动“SPRINGCLOUDDEMO-DEPT”这个微服务时，去加载我们自己ribbon配置类
@RibbonClient(name = "SPRINGCLOUDDEMO-DEPT", configuration = MySelfRule.class)
public class DeptConsumer80App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80App.class, args);
	}
}
