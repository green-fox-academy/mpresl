package com.greenfoxacademy.reddit.reddit.controller;

import com.greenfoxacademy.reddit.reddit.model.Post;
import com.greenfoxacademy.reddit.reddit.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("post")
public class RedditController {

    private final PostService postService;

    public RedditController(PostService postService){
        this.postService = postService;
    }

    @GetMapping("/")
    public String showAll(Model model){
        model.addAttribute("posts", postService.findAll());
        return "home";
    }

    @GetMapping("/add")
    public String newPost(Model model){
        model.addAttribute("post", new Post());
        return "addPost";
    }

    @PostMapping("/add")
    public String addPost(@ModelAttribute Post post){
        postService.save(post);
        return "redirect:/post/";
    }



}
