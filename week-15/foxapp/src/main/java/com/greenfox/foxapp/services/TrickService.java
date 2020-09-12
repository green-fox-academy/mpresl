package com.greenfox.foxapp.services;

import com.greenfox.foxapp.Model.Fox;
import com.greenfox.foxapp.Model.Trick;

import java.util.List;

public interface TrickService {

    public void addTrick(Trick trick);

    public Trick findTrick(String name);

    public List<Trick> findAll();
}
