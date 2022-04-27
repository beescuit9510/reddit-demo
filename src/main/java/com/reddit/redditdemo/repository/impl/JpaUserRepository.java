package com.reddit.redditdemo.repository.impl;

import com.reddit.redditdemo.model.User;
import com.reddit.redditdemo.repository.PostRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface JpaUserRepository extends JpaRepository<User,Long>, PostRepository {
}
