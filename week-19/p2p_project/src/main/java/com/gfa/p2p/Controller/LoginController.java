package com.gfa.p2p.Controller;

import com.gfa.p2p.Model.LoginRequest;
import com.gfa.p2p.Model.LoginResponse;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    private final String base_url = "https://rascals-chat.herokuapp.com/API/USER";


    @GetMapping("/login")
    public String loginForm(Model model){
        return "newlogin";
    }

    @PostMapping("/login")
    public String newLogin(LoginRequest loginRequest, RedirectAttributes attributes){
        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<LoginRequest> request = new HttpEntity<>(loginRequest);
        LoginResponse response = restTemplate.postForObject(base_url + "/login", request, LoginResponse.class);
         return "redirect:/home/" + response.getApiKey();


    }

}
