package com.bdqn.bean;

import java.util.Date;

public class SysRole {

	/*
	 *  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '角色ID',
 role_name VARCHAR(50) COMMENT '角色名',
 enabled INT COMMENT '有效 标志',
 create_by BIGINT COMMENT '创建人',
 create_time DATETIME COMMENT '创建时间',
	 */
	
	/**
	 * 角色ID
	 */
	private Long id;
	/**
	 * 角色名
	 */
	private String roleName;
	/**
	 * 有效 标志
	 */
	private Integer enabled;
	/**
	 * 创建人
	 */
	private Long createBy;
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	
	
}
