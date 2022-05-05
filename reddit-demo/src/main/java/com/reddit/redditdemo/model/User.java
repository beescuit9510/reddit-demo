package com.reddit.redditdemo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NonNull
    private String username;

    @NonNull
    private String password;


    @OneToMany(mappedBy = "user",
            fetch = FetchType.LAZY)
    private List<Post> posts;


}
