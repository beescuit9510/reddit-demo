package com.reddit.redditdemo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long community_id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private CommunityType type;

    @Column
    private String profilePhoto;

    @OneToMany(mappedBy = "community")
    private List<Post> posts;

}
