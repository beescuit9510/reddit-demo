package com.reddit.redditdemo.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long userId;

    @Column
    @NonNull
    private String username;

    @Column
    @NonNull
    private String password;


    @OneToMany(mappedBy = "user",
            fetch = FetchType.LAZY)
    private List<Post> posts;


}
