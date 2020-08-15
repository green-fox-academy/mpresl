package com.greenfoxacademy.springstart.springstart.controllers;

import com.greenfoxacademy.springstart.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {
    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name){

        Greeting greeting = new Greeting();

        model.addAttribute("name", name);
        model.addAttribute("greetCount", greeting.getGreetCount());
        model.addAttribute("greeting", greeting.getRandomGreeting());
        return "greeting";
    }
}
