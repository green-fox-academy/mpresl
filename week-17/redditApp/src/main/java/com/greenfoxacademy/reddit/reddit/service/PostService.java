package com.greenfoxacademy.reddit.reddit.service;


import com.greenfoxacademy.reddit.reddit.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    void save(Post post);
    Post findById(Long id);
    List<Post> findAll();

}
