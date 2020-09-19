package com.greenfoxacademy.reddit.reddit.service;

import com.greenfoxacademy.reddit.reddit.model.User;
import com.greenfoxacademy.reddit.reddit.respository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return username.equals(password);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findByName(String username) {
        return userRepository.findAll().stream().filter(t -> t.getUserName().equalsIgnoreCase(username)).findFirst().orElse(null);
    }
}
