package com.bdqn.bean;

import java.io.Serializable;

public class SysPrivilege implements Serializable {

	
	
	/*
	 *  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '权限ID',
   privilege_name VARCHAR(50) COMMENT '权限名称',
   privilege_url VARCHAR(200) COMMENT '权限URL',
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7476750842756760110L;
	/**
	 * 权限ID
	 */
	private Long id;
	/**
	 * 权限名称
	 */
	private String privilegeName;
	
	/**
	 * 权限URL
	 */
	private String privilegeUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrivilegeName() {
		return privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	public String getPrivilegeUrl() {
		return privilegeUrl;
	}

	public void setPrivilegeUrl(String privilegeUrl) {
		this.privilegeUrl = privilegeUrl;
	}
	
	
	
	
}
