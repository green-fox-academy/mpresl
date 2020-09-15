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
    private int voteCount;


    public Post(String title, String url){
        this.title = title;
        this.url = url;
        this.voteCount = 0;
    }
    public void changeVote(int num){
        this.voteCount += num;
    }


}
