package com.mao.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long deptId;
	private String deptName;
	private String db_source; // 来自那个数据库，一个服务对应一个数据库，所以可以存储到不同的数据库

}
