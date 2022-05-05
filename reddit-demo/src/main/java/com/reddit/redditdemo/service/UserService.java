package com.reddit.redditdemo.service;

import com.reddit.redditdemo.model.User;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

    Optional<User> findById(Long userId);

    Slice<User> findAll(PageRequest page);

    User save(User user);

    void deleteById(Long userId);
}
