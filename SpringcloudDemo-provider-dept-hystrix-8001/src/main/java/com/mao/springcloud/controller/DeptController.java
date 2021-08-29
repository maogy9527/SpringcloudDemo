package com.mao.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mao.springcloud.entities.Dept;
import com.mao.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;

	@RequestMapping(value = "/dept/getDeptById/{id}", method = RequestMethod.GET)
	// @HystrixCommand注解，在该方法抛出异常之后，会执行fallbackMethod中所指定的方法
	@HystrixCommand(fallbackMethod = "hystrixGet_Error")
	public Dept getDeptById(@PathVariable("id") Long id) {
		Dept dept = deptService.getDeptById(id);
		if (dept == null) {
			throw new RuntimeException("该" + id + "所查询的信息不存在");
		}
		return dept;
	}

	public Dept hystrixGet_Error(@PathVariable("id") Long id) {
		Dept dept = new Dept();
		dept.setDeptId(id);
		dept.setDeptName("该" + id + "所查询的信息不存在");
		return dept;
	}
}
