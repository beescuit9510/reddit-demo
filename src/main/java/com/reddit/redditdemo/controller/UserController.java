package com.reddit.redditdemo.controller;

import com.reddit.redditdemo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService service;

}
