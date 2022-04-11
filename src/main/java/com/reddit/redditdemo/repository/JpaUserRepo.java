package com.reddit.redditdemo.repository;

import com.reddit.redditdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface JpaUserRepo extends JpaRepository<User, Long>,UserRepository {
}
