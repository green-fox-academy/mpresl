package com.greenfox.foxapp.services;

import com.greenfox.foxapp.Model.Fox;
import com.greenfox.foxapp.repository.FoxRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Calendar;
import java.util.List;

@Service
public class FoxServiceImpl implements FoxService{

    private final FoxRepo foxRepo;
    Calendar calendar;

    @Autowired
    public FoxServiceImpl(FoxRepo foxRepo){
        this.foxRepo = foxRepo;
    }

    @Override
    public void addFox(String name){
        foxRepo.addFox(name);
    }

    @Override
    public Fox findFox(String name) {
        return foxRepo.findFox(name);
    }

    @Override
    public void addAction(String action, String typeOfaction, String name) {
        Calendar calendar = Calendar.getInstance();
        String fullSentence = calendar.getTime() + ": " + name + " learned to "+ action+".";
        foxRepo.addActHist(fullSentence);
    }

    @Override
    public List<String> getAllHistory() {
        return foxRepo.getHistoryList();
    }

    @Override
    public void addNutritionHist(String newNutr, String oldNutr, String typeOfAction, String name) {
        Calendar calendar = Calendar.getInstance();
        String fullSentence = "";
        if (typeOfAction.equals("drink")){
            fullSentence += calendar.getTime() + ": Drink for " + name +" has been changed from "+ oldNutr +" to " +newNutr + ".";
        }else if (typeOfAction.equals("food")){
            fullSentence += calendar.getTime() + ": Food for " +name +" has been changed from "+ oldNutr +" to " +newNutr + ".";
        }
        foxRepo.addActHist(fullSentence);
    }


}
