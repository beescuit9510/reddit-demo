package com.reddit.redditdemo.controller;

import com.reddit.redditdemo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;

public class PostController {

    PostService service;

    @Autowired
    public PostController(PostService service) {
        this.service = service;
    }
}
