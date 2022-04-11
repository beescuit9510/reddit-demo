package com.reddit.redditdemo.repository;

import com.reddit.redditdemo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface JpaPostRepo extends JpaRepository<Post, Long>,PostRepository {
}
