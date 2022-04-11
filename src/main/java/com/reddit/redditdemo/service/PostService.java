package com.reddit.redditdemo.service;


import com.reddit.redditdemo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PostService {

    PostRepository repository;

    @Autowired
    public PostService(PostRepository repository) {
        this.repository = repository;
    }
}
