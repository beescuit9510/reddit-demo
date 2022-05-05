package com.reddit.redditdemo.model;

import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeId;

    @NonNull
    private Long postId;

    @NonNull
    private Long UserId;


}
