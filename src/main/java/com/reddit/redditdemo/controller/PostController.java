package com.reddit.redditdemo.controller;

import com.reddit.redditdemo.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class PostController {

    private final PostService service;
}
