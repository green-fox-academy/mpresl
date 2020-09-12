package com.greenfoxacademy.reddit.reddit.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "posts")
@Getter
@Setter
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String url;
    private Integer voteCount = 0;


    public Post(String title, String url){
        this.title = title;
        this.url = url;
    }


}
