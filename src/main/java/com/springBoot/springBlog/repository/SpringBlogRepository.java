package com.springBoot.springBlog.repository;

import com.springBoot.springBlog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringBlogRepository extends JpaRepository <Post, Long>{
}
