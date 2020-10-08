package com.gfa.p2p.Controller;

import com.gfa.p2p.Model.LoginRequest;
import com.gfa.p2p.Model.LoginResponse;
import com.gfa.p2p.Model.MessageRequest;
import com.gfa.p2p.Model.MessageResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

    private final String base_url = "https://rascals-chat.herokuapp.com/";

    @GetMapping({"/", "/home"})
    public String showHome(Model model, RedirectAttributes attributes){

        model.getAttribute("apiKey");
        model.addAttribute("message", new MessageRequest());
        model.addAttribute("api", model.getAttribute("apiKey"));
        return "home";
    }

    @PostMapping("/sendMessage/{apiKey}")
    public String sendnewmessage(MessageRequest messageRequest, Model model, @PathVariable String apiKey, RedirectAttributes attributes){


        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("apiKey", apiKey);
        HttpEntity<MessageRequest> request = new HttpEntity<>(messageRequest, headers);


        MessageResponse response = restTemplate.postForObject(base_url + "API/MESSAGE", request, MessageResponse.class);
        response.getContent();


        attributes.addFlashAttribute("apiKey", apiKey);

        return "redirect:/home";
    }

}
