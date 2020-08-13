package com.greenfoxacademy.springstart.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloWorldController {

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String helloGuys(){
        return "hello there!";
    }
}
