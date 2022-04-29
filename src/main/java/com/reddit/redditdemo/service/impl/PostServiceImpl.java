package com.reddit.redditdemo.service.impl;


import com.reddit.redditdemo.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostServiceImpl {

    private final PostRepository repository;

}
