package com.greenfoxacademy.basicwebshop.refactor;

import com.greenfoxacademy.basicwebshop.models.Item;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShopItems {
    private List<Item> shopItems;

    public ShopItems(){
        this.shopItems = new ArrayList<>();
        shopItems.add(new Item("Running Shoes", "Nike Shoes for running", 130, 4, "clothing"));
        shopItems.add(new Item("Printer", "An HP Printer that will print pages", 60, 2, "electronics"));
        shopItems.add(new Item("Coca-Cola", "0.5L Standard cola drink", 1, 0, "food"));
        shopItems.add(new Item("Wokin", "Chicken with fried rice and WOKIN sauce", 6, 100, "food"));
        shopItems.add(new Item("T-Shirt", "Green New York Jets T-shirt", 20, 3, "clothing"));

    }
    public List<Item> getAvailableItems(){
        return shopItems.stream()
                .filter(item -> item.getStock()>0)
                .collect(Collectors.toList());
    }

    public List<Item> getAllType(String requestedT){
        return shopItems.stream()
                .filter(item -> item.getType().equalsIgnoreCase(requestedT))
                .collect(Collectors.toList());
    }

    public List<Item> getCheapestItems(){

        return shopItems.stream()
                .sorted(Comparator.comparingLong(Item::getPrice))
                .collect(Collectors.toList());
    }
    public List<Item> searchNike(){
        return shopItems.stream()
                .filter(item -> item.getName().toLowerCase().contains("nike") ||
                        item.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
    }
    public List<Item> searchTerm(String terms){
        return shopItems.stream()
                .filter(item -> item.getName().toLowerCase().contains(terms.toLowerCase()) ||
                        item.getDescription().toLowerCase().contains(terms.toLowerCase()))
                .collect(Collectors.toList());
    }
    public Item getMostExpensive(){
        List<Item> sortedList = shopItems.stream()
                .sorted(Comparator.comparingLong(Item::getPrice))
                .collect(Collectors.toList());

        return sortedList.get(sortedList.size()-1);
    }

    public double getAverageStock(){
        return shopItems.stream()
                .mapToDouble(Item::getStock)
                .average()
                .getAsDouble();
    }

    public List<Item> getShopItems() {
        return shopItems;
    }

    public void setShopItems(List<Item> shopItems) {
        this.shopItems = shopItems;
    }
}
