package com.greenfox.foxapp.repository;

import com.greenfox.foxapp.Model.Fox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class FoxRepo {

    private List<Fox> foxList;

    private List<String> historyList;

    public FoxRepo(){
        this.foxList = new ArrayList<>();
        this.historyList = new ArrayList<>();
    }

    public void addFox(String name){
        this.foxList.add(new Fox(name));
    }

    public Fox findFox(String name){
        return this.foxList.stream()
                .filter(t -> t.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public List<Fox> findAll(){
        return this.foxList.stream().collect(Collectors.toList());
    }

    public void addActHist(String action){
        this.historyList.add(action);
    }

    public List<String> getHistoryList(){
        return this.historyList;
    }
}
