package com.bdqn.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.bdqn.bean.SysUser;
import com.bdqn.mapper.SysUserMapper;

public class TestUserMapper {

	@Test
	public void testSelectUserAndRoleById () {
		// 如果查出一条是可以的，如果查出了多条那就不可以，应为这里是1对1的关系
		SqlSession session =  SessionFactoryUtil.getSession();
		SysUserMapper mapper = session.getMapper(SysUserMapper.class);
		SysUser user = mapper.selectUserAndRoleById(1L);
		System.out.println(user);
		session.close();
		
	}
	
	// 通过resultMap进行封装结果返回，最终返回也是通过SysUser返回的。
	@Test
	public void testSelectUserAndRoleById2 () {
		// 如果查出一条是可以的，如果查出了多条那就不可以，应为这里是1对1的关系
		SqlSession session =  SessionFactoryUtil.getSession();
		SysUserMapper mapper = session.getMapper(SysUserMapper.class);
		SysUser user = mapper.selectUserAndRoleById2(1L);
		System.out.println(user);
		session.close();
		
	}
	
	
	// 通过resultMap进行封装结果返回，最终返回也是通过SysUser返回的。
	@Test
	public void testSelectUserAndRoleById3 () {
		// 如果查出一条是可以的，如果查出了多条那就不可以，应为这里是1对1的关系
		SqlSession session =  SessionFactoryUtil.getSession();
		SysUserMapper mapper = session.getMapper(SysUserMapper.class);
		SysUser user = mapper.selectUserAndRoleById2(1004L);
		System.out.println(user);
		session.close();
		
	} 
	
	// 通过resultMap进行封装结果返回，最终返回也是通过SysUser返回的。
	@Test
	public void testSelectUserAndRoleById4 () {
		// 如果查出一条是可以的，如果查出了多条那就不可以，应为这里是1对1的关系
		SqlSession session =  SessionFactoryUtil.getSession();
		SysUserMapper mapper = session.getMapper(SysUserMapper.class);
		SysUser user = mapper.selectUserAndRoleById4(1L);
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
