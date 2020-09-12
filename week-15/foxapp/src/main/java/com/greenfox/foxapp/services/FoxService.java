package com.greenfox.foxapp.services;

import com.greenfox.foxapp.Model.Fox;

import java.util.List;

public interface FoxService {

    public void addFox(String name);

    public Fox findFox(String name);

    public void addAction(String action, String typeOfaction, String name);

    public List<String> getAllHistory();

    public void addNutritionHist(String newNutr, String oldNutr, String typeOfAction, String name);

}
