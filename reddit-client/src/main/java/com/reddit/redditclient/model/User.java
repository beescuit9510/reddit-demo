package com.reddit.redditclient.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class User implements Serializable {

    private Long userId;

    private String username;

    private String password;

//    private List<Post> posts;


}
