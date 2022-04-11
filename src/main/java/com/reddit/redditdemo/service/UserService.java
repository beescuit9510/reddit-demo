package com.reddit.redditdemo.service;

import com.reddit.redditdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }
}