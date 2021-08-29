package com.mao.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mao.springcloud.dao.DeptDao;
import com.mao.springcloud.entities.Dept;
import com.mao.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptDao deptDao;
	
	@Override
	public Dept getDeptById(Long id) {
		Dept dept = deptDao.findDeptById(id);
		return dept;
	}

}
