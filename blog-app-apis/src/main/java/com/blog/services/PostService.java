package com.blog.services;

import java.util.List;

import com.blog.entities.Post;
import com.blog.paylods.PostDto;
import com.blog.paylods.PostResponse;

public interface PostService {
	
	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	//delete
	void deletePost(Integer postId);
	//get
	PostDto getPostById(Integer postId);
	//getAll
	PostResponse getAllPost(Integer pageNumber, Integer pageSize);
	//get all posts by category
	PostResponse getPostByCategory(Integer categoryId, Integer pageNumber, Integer pageSize);
	//get all posts by user
	PostResponse getPostByUser(Integer userId, Integer pageNumber, Integer pageSize);
	//search post
	List<PostDto> searchPost(String keyword);
}
