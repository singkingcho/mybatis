package com.bdqn.mapper;

import org.apache.ibatis.annotations.Param;

import com.bdqn.bean.Author;

public interface AuthorMapper {
   
	Author selectById(@Param("id")Integer id);
}