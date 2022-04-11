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
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long communityId;

    @Column
    @NonNull
    private String name;

    @Column
    @NonNull
    private String description;

    @Column
    @NonNull
    private CommunityType type;

    @Column
    @NonNull
    private String profilePhoto;

    @OneToMany(mappedBy = "community")
    private List<Post> posts;

}
