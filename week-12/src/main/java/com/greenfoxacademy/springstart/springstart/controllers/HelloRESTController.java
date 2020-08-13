package com.greenfoxacademy.springstart.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    @RequestMapping("/greeting")
    public Greeting greatGreet(@RequestParam String name){

        Greeting greeting = new Greeting("Hello there "+name);
        return greeting;
    }
}
