package com.bdqn.mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

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
		
	}
}
