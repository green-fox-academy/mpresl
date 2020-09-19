package com.greenfoxacademy.reddit.reddit.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

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

    @Temporal(value = TemporalType.DATE)
    private Date createdDate;

    @ManyToOne
    private User user;



    public Post(String title, String url){
        this.title = title;
        this.url = url;
        this.voteCount = 1;
    }

    public void changeVote(int num){
        this.voteCount += num;
    }

}
