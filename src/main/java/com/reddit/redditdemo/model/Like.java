package com.reddit.redditdemo.model;

import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long likeId;

    @Column
    @NonNull
    private Long postId;

    @Column
    @NonNull
    private Long UserId;


}
