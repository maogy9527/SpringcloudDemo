package com.mao.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mao.springcloud.dao.DeptDao;
import com.mao.springcloud.entities.Dept;
import com.mao.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{

	private final static Integer i = 1;
	
	@Autowired
	private DeptDao deptDao;
	
	@Override
	public Dept getDeptById(Long id) {
		Dept dept = deptDao.findDeptById(id);
		return dept;
	}
	
	public Dept getDeptById1(Long id) {
		
		String str = "l";
		
		StringBuffer sb = new StringBuffer("xx");
		
		StringBuilder builder = new StringBuilder("11");
		
		return null;
	}
	
	public static void main(String[] args) {
		double a1 = 2.10;
		double a2 = 2.1;
		if (a1 == a2) {
			System.out.println("yes1");
		}
//		if (a1.equals(a2)) {
//			System.out.println("yes2");
//		}
		
		String a = new String("ab"); // a 为一个引用
		String b = new String("ab"); // b为另一个引用,对象的内容一样
		String aa = "ab"; // 放在常量池中
		String bb = "ab"; // 从常量池中查找
		
		if (aa == bb) // true
		System.out.println("aa==bb");
		if (a == b) // false，非同一对象
		System.out.println("a==b");
		if (a.equals(b)) // true
		System.out.println("aEQb");
		if (42 == 42.0) {
			System.out.println("true");
		}
		
	}

}
