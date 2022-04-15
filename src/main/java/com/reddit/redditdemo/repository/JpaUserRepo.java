package com.reddit.redditdemo.repository;

import com.reddit.redditdemo.model.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface JpaUserRepo extends JpaRepository<User, Long>,UserRepository {


    @Override
    List<User> findAll();

    @Override
    List<User> findAll(Sort sort);

    @Override
    List<User> findAllById(Iterable<Long> longs);

    @Override
    <S extends User> List<S> saveAll(Iterable<S> entities);

    @Override
    User getById(Long aLong);

}
