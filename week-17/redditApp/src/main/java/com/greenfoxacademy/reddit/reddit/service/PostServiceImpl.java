package com.greenfoxacademy.reddit.reddit.service;

import com.greenfoxacademy.reddit.reddit.model.Post;
import com.greenfoxacademy.reddit.reddit.respository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService  {
    @Autowired
    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public Post findById(Long id) {
        return postRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public void deleteBtId(Long id) {
        postRepository.deleteById(id);
    }
}
