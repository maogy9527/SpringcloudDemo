package com.mao.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mao.springcloud.entities.Dept;
import com.mao.springcloud.service.DeptClientService;

@RestController
public class DeptControllerConsumer {

	@Autowired
	private DeptClientService deptClientService;
	
	@RequestMapping(value = "/consumer/dept/getDeptById/{id}", method = RequestMethod.GET)
	public Dept getDeptById(@PathVariable("id") Long id) {
		Dept dept = deptClientService.getDeptById(id);
		return dept;
	}
}
