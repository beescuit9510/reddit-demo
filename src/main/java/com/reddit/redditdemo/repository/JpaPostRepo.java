package com.reddit.redditdemo.repository;

import com.reddit.redditdemo.model.Post;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface JpaPostRepo extends JpaRepository<Post, Long>,PostRepository {

    @Override
    List<Post> findAll();

    @Override
    List<Post> findAll(Sort sort);

    @Override
    List<Post> findAllById(Iterable<Long> longs);

    @Override
    <S extends Post> List<S> saveAll(Iterable<S> entities);

    @Override
    Post getById(Long aLong);
}
