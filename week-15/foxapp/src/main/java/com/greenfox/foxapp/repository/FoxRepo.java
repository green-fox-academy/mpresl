package com.greenfox.foxapp.repository;

import com.greenfox.foxapp.Model.Fox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class FoxNameList {

    private List<Fox> foxList;

    public FoxNameList(){
        this.foxList = new ArrayList<>();
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
}
