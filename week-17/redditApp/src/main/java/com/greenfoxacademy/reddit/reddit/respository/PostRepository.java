package com.greenfoxacademy.reddit.reddit.respository;

import com.greenfoxacademy.reddit.reddit.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository <Post, Long> {

}
