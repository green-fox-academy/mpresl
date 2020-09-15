package com.greenfoxacademy.reddit.reddit.controller;

import com.greenfoxacademy.reddit.reddit.model.Post;
import com.greenfoxacademy.reddit.reddit.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}/upvote")
    public String changeVote(@PathVariable Long id, Model model){
        postService.findById(id).changeVote(1);
        postService.save(postService.findById(id));
        return "redirect:/post/";
    }

    @GetMapping("/{id}/downvote")
    public String downVote(@PathVariable Long id, Model model){
        postService.findById(id).changeVote(-1);
        postService.save(postService.findById(id));
        return "redirect:/post/";
    }



}
