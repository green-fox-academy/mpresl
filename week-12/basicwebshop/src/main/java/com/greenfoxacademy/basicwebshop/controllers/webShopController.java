package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.refactor.ShopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class webShopController {
    ShopItems shopItems = new ShopItems();

    @GetMapping("/")
    public String displayShop(Model model) {
        model.addAttribute("shopItems", shopItems.getShopItems());
        return "shop";
    }

    @GetMapping("/only-available")
    public String onlyAvail(Model model) {
        model.addAttribute("shopItems", shopItems.getAvailableItems());
        return "shop";
    }

    @GetMapping("/cheapest-first")
    public String cheap(Model model) {
        model.addAttribute("shopItems", shopItems.getCheapestItems());
        return "shop";
    }

    @GetMapping("/nikeSearch")
    public String nike(Model model) {
        model.addAttribute("shopItems", shopItems.searchNike());
        return "shop";
    }

    @GetMapping("/averageStock")
    public String aveStock(Model model) {
        model.addAttribute("aveStock", shopItems.getAverageStock());
        return "averageStock";
    }

    @GetMapping("/mostExpensive")
    public String expensive(Model model) {
        model.addAttribute("shopItems", shopItems.getMostExpensive());
        return "shop";
    }
//@GetMapping("/only-available")
//    public String onlyAvail(Model model) {
//        model.addAttribute("availableItems", shopItems.getAvailableItems());
//        return "onlyAvailable";
//    }
//
//    @GetMapping("/cheapest-first")
//    public String cheap(Model model) {
//        model.addAttribute("cheapest", shopItems.getCheapestItems());
//        return "cheapest";
//    }
//
//    @GetMapping("/nikeSearch")
//    public String nike(Model model) {
//        model.addAttribute("nikeSearch", shopItems.searchNike());
//        return "nikeSearch";
//    }
//
//    @GetMapping("/averageStock")
//    public String aveStock(Model model) {
//        model.addAttribute("aveStock", shopItems.getAverageStock());
//        return "averageStock";
//    }
//
//    @GetMapping("/mostExpensive")
//    public String expensive(Model model) {
//        model.addAttribute("exp", shopItems.getMostExpensive());
//        return "mostExpensive";
//    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searching(@RequestParam(value = "terms", required = false) String terms, Model model) {
        model.addAttribute("shopItems", shopItems.searchTerm(terms));
        return "shop";
    }
}
