package com.mao.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mao.springcloud.entities.Dept;

@RestController
public class DeptControllerConsumer {

//	private static final String REST_URL_PREFIX = "http://localhost:8001/";
	private static final String REST_URL_PREFIX = "http://SPRINGCLOUDDEMO-DEPT";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "consumer/dept/getDeptById/{id}", method = RequestMethod.GET)
	public Dept getDeptById(@PathVariable("id") Long id) {
		Dept dept = restTemplate.getForObject(REST_URL_PREFIX + "/dept/getDeptById/" + id, Dept.class);
		return dept;
	}
	
	@RequestMapping(value = "consumer/dept/getDiscovery", method = RequestMethod.GET)
	public Object getDiscovery(){
		Object forObject = restTemplate.getForObject(REST_URL_PREFIX + "/dept/getDiscovery", Object.class);
		
		return forObject;
	}
}
