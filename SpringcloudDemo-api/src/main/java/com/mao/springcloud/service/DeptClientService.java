package com.mao.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mao.springcloud.entities.Dept;

//@FeignClient(value = "SPRINGCLOUDDEMO-DEPT")
// 设置熔断服务
@FeignClient(value = "SPRINGCLOUDDEMO-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
	
	@RequestMapping(value = "/dept/getDeptById/{id}", method = RequestMethod.GET)
	public Dept getDeptById(@PathVariable("id") Long id);
}
