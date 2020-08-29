package com.greenfox.foxapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenfoxApplicationController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/information")
    public String info(){
        return "information";
    }
}
