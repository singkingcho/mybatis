package com.bdqn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MyMapperProxy<T> implements InvocationHandler{

	private Class<T> mapperInterface;
	
	private SqlSession sqlsession;
	
	
	
	public MyMapperProxy(Class<T> mapperInterface, SqlSession sqlsession) {
		this.mapperInterface = mapperInterface;
		this.sqlsession = sqlsession;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 针对不同的SQL类型，调用不同的方法
		List<T> list =sqlsession.selectList(mapperInterface.getCanonicalName() + " ." + 
				method.getName());
		return list;
	}

	
}
