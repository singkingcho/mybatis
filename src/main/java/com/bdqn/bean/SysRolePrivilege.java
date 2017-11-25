package com.bdqn.bean;

import java.io.Serializable;

/**
 * 用户权限关联
 * @author singkingcho
 *
 */
public class SysRolePrivilege implements Serializable{

	/*
	 *   role_id BIGINT COMMENT '角色ID',
  privilege_id BIGINT COMMENT '权限ID'
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8506279296429959360L;


	/**
	 * 角色ID
	 */
	private Long roleId;
	
	
	/**
	 * 权限ID
	 */
	private Long privilegeId;


	public Long getRoleId() {
		return roleId;
	}


	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	public Long getPrivilegeId() {
		return privilegeId;
	}


	public void setPrivilegeId(Long privilegeId) {
		this.privilegeId = privilegeId;
	}
	
	
}
