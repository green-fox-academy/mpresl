package com.greenfox.foxapp.services;

import org.springframework.stereotype.Service;

@Service
public class Fox {
    private String name;

    Fox(){}
    Fox(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
