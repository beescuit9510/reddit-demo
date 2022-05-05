package com.reddit.redditdemo.controller;

import com.reddit.redditdemo.model.Post;
import com.reddit.redditdemo.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping(path="/api/posts", produces="application/json")
@CrossOrigin(origins={"http://redditcloud:8080", "http://redditcloud.com"})
public class PostController {

    private final PostService service;


    @GetMapping
    public Iterable<Post> allPosts() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @PreAuthorize("#{hasRole('ADMIN')}")
    public Post savePost(@RequestBody Post ingredient) {
        return service.save(ingredient);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PreAuthorize("#{hasRole('ADMIN')}")
    public void deletePost(@PathVariable("id") String ingredientId) {
        service.deleteById(ingredientId);
    }
}
