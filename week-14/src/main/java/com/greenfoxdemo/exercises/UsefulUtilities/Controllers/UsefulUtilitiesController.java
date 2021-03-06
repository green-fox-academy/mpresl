package com.greenfoxdemo.exercises.UsefulUtilities.Controllers;

import com.greenfoxdemo.exercises.UsefulUtilities.Services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilitiesController {

    private final UtilityService utilityService;

    public UsefulUtilitiesController(UtilityService utilityService){
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String showUseful(){
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String colored(Model model){
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String validate(Model model, @RequestParam String email){
        model.addAttribute("vld", utilityService.validateEmail(email));
        model.addAttribute("email", email);
        return "email";
    }

    @GetMapping("/useful/encode")
    public String encode(Model model, @RequestParam String word, @RequestParam Integer number){
        model.addAttribute("encoded", utilityService.caesar(word, number));
        return "encode";
    }

    @GetMapping("/useful/decode")
    public String decode(Model model, @RequestParam String word, @RequestParam Integer number){
        model.addAttribute("decoded", utilityService.caesar(word, number));
        return "decoded";
    }
}
