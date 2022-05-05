package com.reddit.redditdemo.service;


import com.reddit.redditdemo.model.Post;
import org.springframework.stereotype.Service;

@Service
public interface PostService {

    Iterable<Post> findAll();

    Post save(Post ingredient);

    void deleteById(String ingredientId);
}
