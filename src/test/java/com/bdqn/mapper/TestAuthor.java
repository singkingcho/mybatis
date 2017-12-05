package com.bdqn.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.bdqn.bean.Author;
import com.bdqn.bean.Blog;

public class TestAuthor {

	@Test
	public void m1() {
		SqlSession session = SessionFactoryUtil.getSession();
		AuthorMapper mapper = session.getMapper(AuthorMapper.class);
		Author a = mapper.selectById(1);
		for(Blog blog : a.getBlogs()) {
			System.out.println(blog);
		}
		session.close();
	}
}







 






