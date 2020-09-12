package com.greenfox.foxapp.controllers;

import com.greenfox.foxapp.Model.Fox;
import com.greenfox.foxapp.Model.Trick;
import com.greenfox.foxapp.services.FoxService;
import com.greenfox.foxapp.services.TrickService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
    FoxService foxService;
    private final TrickService trickService;


    public FoxController(FoxService foxService, TrickService trickService){
        this.foxService = foxService;
        this.trickService = trickService;
    }

    @PostMapping("/nutriStore")
    public String pickNutri(@RequestParam String name, @RequestParam String food, @RequestParam String drink){
        Fox fox = foxService.findFox(name);
        if (!drink.equalsIgnoreCase(fox.getDrink())){
            String old = fox.getDrink();
            fox.setDrink(drink);
            foxService.addNutritionHist(drink, old, "drink", name);
        }
        if (!food.equalsIgnoreCase(fox.getFood())) {
            String last = fox.getFood();
            fox.setFood(food);
            foxService.addNutritionHist(food, last, "food", name);

        }
        return "redirect:/?name=" +name;
    }

//    @PostMapping("/trickCenter")
//    public String newTricks(@RequestParam String name, @RequestParam String trick){
//        Fox fox = foxService.findFox(name);
//        fox.addTrick(trickService.findTrick(trick));
//        return "redirect:?name=" + name;
//    }
    @PostMapping("/trickCenter")
    public String newTricks(@RequestParam String name, @RequestParam String trick){
        Fox fox = foxService.findFox(name);
        fox.addTrick(trickService.findTrick(trick));
        foxService.addAction(trick, "trick", name);
        return "redirect:/?name=" + name;
    }

}
