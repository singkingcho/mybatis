package com.bdqn.bean;

import java.io.Serializable;
import java.util.Date;

public class SysRole implements Serializable{

	/*
	 *  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '角色ID',
 role_name VARCHAR(50) COMMENT '角色名',
 enabled INT COMMENT '有效 标志',
 create_by BIGINT COMMENT '创建人',
 create_time DATETIME COMMENT '创建时间',
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3290691815164885906L;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Integer getEnabled() {
		return enabled;
	}
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	public Long getCreateBy() {
		return createBy;
	}
	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "SysRole [id=" + id + ", roleName=" + roleName + ", enabled=" + enabled + ", createBy=" + createBy
				+ ", createTime=" + createTime + "]";
	}
	
	
	
	
	
}
