package com.mao.springcloud.configbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBeans {

	
	@Bean
	@LoadBalanced  // 负载均衡配置
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	
//	@Bean
//	public IRule myrule(){
//		
//		return new RandomRule();  // 负载均衡选择服务的算法规则，先配置为随机算法
//	}
}
