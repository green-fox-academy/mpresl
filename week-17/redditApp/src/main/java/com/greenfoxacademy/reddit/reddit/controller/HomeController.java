package com.greenfoxacademy.reddit.reddit.controller;

import com.greenfoxacademy.reddit.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("posts", postService.findAll());
        return "index";
    }


}
