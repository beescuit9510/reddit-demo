package com.reddit.redditdemo.service.impl;

import com.reddit.redditdemo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl {

    private final UserRepository repository;
}
