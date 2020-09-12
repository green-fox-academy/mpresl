package com.greenfox.foxapp.Model;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private ArrayList<Trick> tricks = new ArrayList<>();
    private String food;
    private String drink;
    private ArrayList<String> actionHistory = new ArrayList<>();

    public Fox(){}
    public Fox(String name){
        this.name = name;
        this.drink = "water";
        this.food = "french fries";
    }

    public void addTrick(Trick trick){
        tricks.add(trick);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Trick> getTricks() {
        return tricks;
    }

    public void setTricks(ArrayList<Trick> tricks) {
        this.tricks = tricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

//    public ArrayList<String> getActionHistory() {
//        return actionHistory;
//    }
//
//    public void setActionHistory(ArrayList<String> actionHistory) {
//        this.actionHistory = actionHistory;
//    }
//
//    public void addAction(String action){
//        this.actionHistory.add(action);
//    }
}
