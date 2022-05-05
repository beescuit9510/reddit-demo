package com.reddit.redditdemo.service.impl;


import com.reddit.redditdemo.repository.PostRepository;
import com.reddit.redditdemo.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository repository;

}
