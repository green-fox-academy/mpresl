package com.gfa.p2p.Controller;

import com.gfa.p2p.Model.LoginRequest;
import com.gfa.p2p.Model.LoginResponse;
import com.gfa.p2p.Model.RegisterResponse;
import com.gfa.p2p.Model.User;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class RegistrationController {

    private final String base_url = "https://rascals-chat.herokuapp.com/";


    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        model.addAttribute("user", new LoginRequest());
        return "register";
    }

    @PostMapping("/register")
    public String register(LoginRequest loginRequest,Model model){

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<LoginRequest> request = new HttpEntity<>(loginRequest);
        RegisterResponse response = restTemplate.postForObject(base_url + "API/USER/register", request, RegisterResponse.class);

        return "redirect:/login";
    }
}
