package com.bdqn.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.bdqn.bean.SysUser;
import com.bdqn.mapper.SysUserMapper;

public class TestUserMapper {

	@Test
	public void testSelectUserAndRoleById () {
		SqlSession session =  SessionFactoryUtil.getSession();
		SysUserMapper mapper = session.getMapper(SysUserMapper.class);
		SysUser user = mapper.selectUserAndRoleById(1L);
		System.out.println(user);
		session.close();
		
	}
	

	@Test
	public void testSelectByPrimaryKey () {
		SqlSession session =  SessionFactoryUtil.getSession();
		SysUserMapper mapper = session.getMapper(SysUserMapper.class);
		 SysUser user = mapper.selectByPrimaryKey(1L);
		 System.out.println(user);
		session.close();
		
	}
}
