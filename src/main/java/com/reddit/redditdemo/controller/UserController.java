package com.reddit.redditdemo.controller;

import com.reddit.redditdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserController {

    UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }
}