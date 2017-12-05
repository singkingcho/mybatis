package com.bdqn.mapper;

import java.util.List;

import com.bdqn.bean.Comment;

public interface CommentMapper {
    
	
	List<Comment> selectByBlogId(Integer blogId);
}