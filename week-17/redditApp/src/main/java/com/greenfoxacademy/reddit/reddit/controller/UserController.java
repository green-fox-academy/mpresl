package com.greenfoxacademy.reddit.reddit.controller;

import com.greenfoxacademy.reddit.reddit.model.User;
import com.greenfoxacademy.reddit.reddit.service.PostServiceImpl;
import com.greenfoxacademy.reddit.reddit.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    private final UserServiceImpl userService;
    private final PostServiceImpl postService;


    public UserController(UserServiceImpl userService, PostServiceImpl postService) {
        this.userService = userService;
        this.postService = postService;
    }

    @GetMapping("/")
    public String loginPage(Model model){
        model.addAttribute("user", new User());
        return "login";
    }


    @GetMapping("/newUser")
    public String newuser(Model model){
        model.addAttribute("user", new User());
        return "newUser";
    }

    @PostMapping("/saveUser")
    public String createUser(@ModelAttribute User user){
        userService.save(user);
        return "redirect:/post/";
    }
}
