package com.reddit.redditdemo.service;


import com.reddit.redditdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    @Override
    Optional<User> findById(Long aLong);

    @Override
    void deleteById(Long aLong);


}