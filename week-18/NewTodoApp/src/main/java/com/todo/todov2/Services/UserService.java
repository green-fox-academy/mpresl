package com.todo.todov2.Services;

import com.todo.todov2.Models.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUserById(long id);
    public void deleteUserById(long id);
}
