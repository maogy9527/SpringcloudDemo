package com.mao.springcloud.service;

import org.springframework.stereotype.Component;

import com.mao.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

// 解耦合，统一处理熔断
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable arg0) {
		return new DeptClientService() {
			
			@Override
			public Dept getDeptById(Long id) {
				Dept dept = new Dept();
				dept.setDeptId(id);
				dept.setDeptName("该" + id + "所查询的信息不存在，consumer提供的降级信息，此刻provide端已关闭");
				
				return dept;
			}
		};
	}

}
