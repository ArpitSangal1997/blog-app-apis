package com.blog.services;

import com.blog.paylods.CommentDto;

public interface CommentService {

	CommentDto createcomment(CommentDto commentDto, Integer postId, Integer userId);
	void deleteComment(Integer commentId);
}
