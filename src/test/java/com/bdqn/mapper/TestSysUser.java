package com.bdqn.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.bdqn.bean.SysRole;
import com.bdqn.bean.SysUser;
import com.bdqn.dao.UserMapper;

public class TestSysUser {

	
	@Test
	public void m1() {
		SqlSessionFactory sessionFactory = SessionFactoryUtil.geteSessionFactory();
		SqlSession session = sessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		SysUser user = mapper.selectById(1001L);
		System.out.println(user);
		session.close();
		
	}
	
	@Test
	public void m2() {
		SqlSessionFactory sessionFactory = SessionFactoryUtil.geteSessionFactory();
		SqlSession session = sessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<SysUser> list = mapper.selectAll();
		for (SysUser sysUser : list) {
			System.out.println(sysUser);
		}
		session.close();
	}
	
	@Test
	public void m3() {
		SqlSession session = SessionFactoryUtil.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<SysRole> list = mapper.selectRolesByUserId(1L);
		for (SysRole sysRole : list) {
			System.out.println(sysRole);
		}
		session.close();
	}
	
	@Test
	public void m4() {
		SqlSession session = SessionFactoryUtil.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		SysUser sysUser = new SysUser();
		sysUser.setId(4L);
		sysUser.setUserName("zhangsan");
		sysUser.setUserPassword("123");
		sysUser.setUserEmail("singkingcho@163.com");
		sysUser.setCreateTime(new Date());
		sysUser.setHeadImg(new byte[] {1,3,3,2});
		int rows = mapper.insert(sysUser);
		System.out.println("影响行数" + rows);
		// 不会自动提交，所以你需要commit一下。
		session.commit();
		session.close();
	}
	
	@Test
	public void m5() {
		SqlSession session = SessionFactoryUtil.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		SysUser sysUser = new SysUser();
		sysUser.setUserName("zhangsan");
		sysUser.setUserPassword("123");
		sysUser.setUserEmail("singkingcho@163.com");
		sysUser.setCreateTime(new Date());
		sysUser.setHeadImg(new byte[] {1,3,3,2});
		// 获得了主键1002
		mapper.insert2(sysUser); 
		System.out.println("主键：" + sysUser.getId());
		// 不会自动提交，所以你需要commit一下。
		session.commit();
		session.close();
	}
	
	
	@Test
	public void m6() {
		SqlSession session = SessionFactoryUtil.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		SysUser sysUser = new SysUser();
		sysUser.setUserName("zhangsan");
		sysUser.setUserPassword("123");
		sysUser.setUserEmail("singkingcho@163.com");
		sysUser.setCreateTime(new Date());
		sysUser.setHeadImg(new byte[] {1,3,3,2});
		// 获得了主键1002
		mapper.insert3(sysUser); 
		System.out.println("主键：" + sysUser.getId());
		// 不会自动提交，所以你需要commit一下。
		session.commit();
		session.close();
	}
	
	@Test
	public void m7() {
		SqlSession session = SessionFactoryUtil.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		// 先查询一个
		SysUser sysUser = mapper.selectById(1003L);
		sysUser.setUserName("王菲");
		mapper.updateById(sysUser);
		// 不会自动提交，所以你需要commit一下。
		session.commit();
		session.close();
	}
}
