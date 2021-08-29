package com.mao.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mao.springcloud.entities.Dept;
import com.mao.springcloud.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;
	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value = "/dept/getDeptByIds/{id}", method = RequestMethod.GET)
	public Dept getDeptById(@PathVariable("id") Long id) {
		Dept dept = deptService.getDeptById(id);
		return dept;
	}
	
	@RequestMapping(value = "/dept/getDiscovery", method = RequestMethod.GET)
	public Object getDiscovery(){
		// 获取拥有的微服务
		List<String> services = client.getServices();
//		List<ServiceInstance> instances = client.getInstances("xxx");
		System.out.println("services-------------"+services);
		
		
		return null;
	}
}
