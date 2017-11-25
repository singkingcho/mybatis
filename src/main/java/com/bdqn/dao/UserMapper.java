package com.bdqn.dao;

import com.bdqn.bean.SysUser;

public interface UserMapper {

	/**
	 * 通过ID查询用户
	 * @param id
	 * @return
	 */
	SysUser selectById(Long id);
	 
}
