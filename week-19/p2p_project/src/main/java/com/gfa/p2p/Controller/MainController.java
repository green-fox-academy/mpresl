package com.gfa.p2p.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private final String base_url = "https://rascals-chat.herokuapp.com/API/CHANNEL";

    @GetMapping({"/", "/home/{apiKey}"})
    public String showHome(@PathVariable String apiKey, Model model){
        return "home";
    }

}
