package com.greenfox.foxapp.repository;

import com.greenfox.foxapp.Model.Trick;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TrickListRepo {
    private List<Trick> trickList;

    public TrickListRepo(){
        this.trickList = new ArrayList<>();
    }

    public void addTrick(Trick trick){
        this.trickList.add(trick);
    }

    public Trick findTrick(String name){
        return this.trickList.stream()
                .filter(t -> t.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public List<Trick> findAll(){
        return new ArrayList<>(this.trickList);
    }
}
