package com.greenfoxacademy.reddit.reddit.service;

import com.greenfoxacademy.reddit.reddit.model.Post;
import com.greenfoxacademy.reddit.reddit.respository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<Post> getAllByUpvotes() {
        return this.postRepository.findAll().stream().sorted(Comparator.comparingLong(Post::getVoteCount).reversed()).collect(Collectors.toList());
    }

    @Override
    public List<Post> findAllFromUserId(Long id) {
        return this.postRepository.findAll().stream().filter(p -> p.getUser().getUserId() == id).collect(Collectors.toList());
    }
}
