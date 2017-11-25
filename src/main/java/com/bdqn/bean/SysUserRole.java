package com.bdqn.bean;

import java.io.Serializable;

public class SysUserRole implements Serializable{

	
	
	/*
	 *  user_id BIGINT COMMENT '用户ID',
  role_id BIGINT COMMENT '角色ID'
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3180278959342758461L;

	private Long userId;
	
	private Long roleId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	
}
