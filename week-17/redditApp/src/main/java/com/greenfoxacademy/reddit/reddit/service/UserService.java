package com.greenfoxacademy.reddit.reddit.service;

import com.greenfoxacademy.reddit.reddit.model.User;
import com.greenfoxacademy.reddit.reddit.respository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    boolean authenticate(String username, String password);
    User findById(Long id);
    List<User> findAll();
    void save(User user);
    User findByName(String username);
}
