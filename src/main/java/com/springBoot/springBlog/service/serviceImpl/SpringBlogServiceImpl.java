package com.springBoot.springBlog.service.serviceImpl;

import com.springBoot.springBlog.model.Post;
import com.springBoot.springBlog.repository.SpringBlogRepository;
import com.springBoot.springBlog.service.SpringblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpringBlogServiceImpl implements SpringblogService {

    @Autowired
    SpringBlogRepository springBlogRepository;

    @Override
    public List<Post> findAll() {
        return springBlogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return springBlogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return springBlogRepository.save(post);
    }
}
