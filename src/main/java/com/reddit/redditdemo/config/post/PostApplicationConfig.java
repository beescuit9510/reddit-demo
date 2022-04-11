package com.reddit.redditdemo.config.post;

import com.reddit.redditdemo.controller.PostController;
import com.reddit.redditdemo.repository.PostRepository;
import com.reddit.redditdemo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {PostRepository.class, PostService.class, PostController.class})
public class PostApplicationConfig {


    @Bean
    public PostService postService(@Autowired PostRepository postRepository) {
        return new PostService(postRepository);
    }

    @Bean
    public PostController postController(@Autowired PostService postService) {
        return new PostController(postService);
    }

}
