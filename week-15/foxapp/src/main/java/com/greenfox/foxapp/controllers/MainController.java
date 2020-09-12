package com.greenfox.foxapp.controllers;

import com.greenfox.foxapp.services.FoxService;
import com.greenfox.foxapp.services.FoxServiceImpl;
import com.greenfox.foxapp.services.TrickService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;

@Controller
public class MainController {

    private final FoxService foxService;
    private final TrickService trickService;

    public MainController(FoxServiceImpl foxServiceImpl, TrickService trickService){
        this.foxService = foxServiceImpl;
        this.trickService = trickService;
    }

    @GetMapping("/")
    public String index(@RequestParam String name, Model model){
        model.addAttribute("fox", foxService.findFox(name));
        model.addAttribute("tricks", foxService.findFox(name).getTricks());
        return "index";
    }

    @GetMapping("/actionHistory")
    public String info(@RequestParam String name, Model model){
        model.addAttribute("fox", foxService.findFox(name));
        model.addAttribute("history", foxService.getAllHistory());
        return "history";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String name){
        foxService.addFox(name);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/nutritionStore")
    public String nutriStore(@RequestParam String name, Model model){
        model.addAttribute("fox", foxService.findFox(name));
        return "nutrition";
    }
//      Without Trick Class
//    @GetMapping("/trickCenter")
//    public String trickStore(@RequestParam String name, Model model){
//        model.addAttribute("fox", foxService.findFox(name));
//        return "trickCenter";
//    }
    @GetMapping("/trickCenter")
    public String trickStore(@RequestParam String name, Model model){
        model.addAttribute("fox", foxService.findFox(name));
        model.addAttribute("tricks", trickService.findAll().stream().filter(t -> !foxService.findFox(name).getTricks().contains(t)).collect(Collectors.toList()));
        return "trickCenter";
    }
}
