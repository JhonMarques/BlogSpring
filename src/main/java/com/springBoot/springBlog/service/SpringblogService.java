package com.springBoot.springBlog.service;

import com.springBoot.springBlog.model.Post;

import java.util.List;

public interface SpringblogService {

    List<Post>findAll();
    Post findById(long id);
    Post save(Post post);

}
