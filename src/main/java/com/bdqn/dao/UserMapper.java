package com.bdqn.dao;

import java.util.List;

import com.bdqn.bean.SysRole;
import com.bdqn.bean.SysUser;

public interface UserMapper {

	/**
	 * 通过ID查询用户
	 * @param id
	 * @return
	 */
	SysUser selectById(Long id);
	
	List<SysUser> selectAll();
	
	List<SysRole> selectRolesByUserId(Long userId);

	
	int insert(SysUser sysUser);
	
	int insert2(SysUser sysUser);
	
	int insert3(SysUser sysUser);
	
	int updateById(SysUser sysUser);
	
}
