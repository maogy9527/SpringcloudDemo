package com.mao.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;

import com.mao.springcloud.entities.Dept;

@Mapper
public interface DeptDao {

	public Dept findDeptById(Long id);
}
