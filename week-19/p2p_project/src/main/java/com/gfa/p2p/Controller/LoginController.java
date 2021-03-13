package com.gfa.p2p.Controller;

import com.gfa.p2p.Model.LoginRequest;
import com.gfa.p2p.Model.LoginResponse;
import com.gfa.p2p.Model.RegisterResponse;
import com.gfa.p2p.Model.UpdateRequest;
import org.hibernate.sql.Update;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    private final String base_url = "https://rascals-chat.herokuapp.com/";


    @GetMapping("/login")
    public String loginForm(Model model){
        return "newlogin";
    }

    @PostMapping("/login")
    public String newLogin(LoginRequest loginRequest, RedirectAttributes attributes){

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<LoginRequest> request = new HttpEntity<>(loginRequest);
        LoginResponse response = restTemplate.postForObject(base_url + "API/USER/login", request, LoginResponse.class);
        attributes.addFlashAttribute("apiKey", response.getApiKey());

        return "redirect:/home/";
    }

    @GetMapping("/update/{apiKey}")
    public String showUpdateUserForm(Model model, @PathVariable String apiKey){
        model.addAttribute("api", apiKey);
        return "updateForm";
    }

    @PostMapping("/update/{apiKey}")
    public String updateUser(UpdateRequest updateRequest, RedirectAttributes attributes, @PathVariable String apiKey){

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<UpdateRequest> request = new HttpEntity<>(updateRequest);
        RegisterResponse response = restTemplate.postForObject(base_url + "API/USER/update", request, RegisterResponse.class);

        attributes.addFlashAttribute("apiKey", apiKey);

        return "redirect:/home/";
    }

}
