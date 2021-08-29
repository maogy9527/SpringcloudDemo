package com.mao.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {

	@Bean
	public IRule myrule(){
		
		return new RandomRuleMao();  // 负载均衡选择服务的算法规则，先配置为随机算法
	}
}
