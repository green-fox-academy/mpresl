package com.greenfoxacademy.reddit.reddit.controller;

import com.greenfoxacademy.reddit.reddit.model.Post;
import com.greenfoxacademy.reddit.reddit.model.User;
import com.greenfoxacademy.reddit.reddit.service.PostService;
import com.greenfoxacademy.reddit.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/{username}")
public class PostsController {
    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;

    @GetMapping({"/", "/posts"})
    public String logedinPosts(@PathVariable("username") String username, Model model){
        model.addAttribute("posts", postService.getAllByUpvotes());
        model.addAttribute("user", username);
        return "index";
    }

    @GetMapping("/posts/byUser/{id}")
    public String showPostsFromUser(@PathVariable("id") long id, Model model, @PathVariable("username") String username){
        model.addAttribute("posts", postService.findAllFromUserId(id));
        model.addAttribute("user", username);
        return "index";
    }


    @RequestMapping("/posts/view/{id}")
    public String view(@PathVariable("id") Long id, Model model, @PathVariable("username") String username){
        Post post = postService.findById(id);

        if (post == null) {
            return "redirect:/";
        }

        model.addAttribute("post", post);
        return "posts/view";
    }

    @GetMapping("/posts/create")
    public String create(Model model, @PathVariable("username") String username){
        model.addAttribute("post", new Post());
        model.addAttribute("username", username);
        return "posts/createPost";
    }


    @PostMapping("/posts/create")
    public String addPost(@ModelAttribute Post post, @PathVariable("username") String username){
        User user = userService.findByName(username);
        if (user != null){
            post.setUser(user);
        }
        post.setCreatedDate(new Date());
        postService.save(post);
        return "redirect:/" + username+ "/";
    }
    @GetMapping("/posts/{id}/upvote")
    public String changeVote(@PathVariable("id") Long id, Model model, @PathVariable("username") String username){
        postService.findById(id).changeVote(1);
        postService.save(postService.findById(id));
        return "redirect:/"+ username + "/";
    }

    @GetMapping("/posts/{id}/downvote")
    public String downVote(@PathVariable("id") Long id, Model model, @PathVariable("username") String username){
        postService.findById(id).changeVote(-1);
        postService.save(postService.findById(id));
        return "redirect:/" + username + "/";
    }

    @GetMapping("/posts/update/{id}")
    public String showUpdatePost(@PathVariable("id") long id, String username, Model model){
        Post post = postService.findById(id);
        model.addAttribute("post", post);
        model.addAttribute("username", username);
        model.addAttribute("users", userService.findAll());
        return "posts/update_post";
    }
}
