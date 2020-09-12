package com.greenfox.foxapp.services;

import com.greenfox.foxapp.Model.Trick;
import com.greenfox.foxapp.repository.TrickListRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrickServiceImpl implements TrickService {

    private final TrickListRepo trickListRepo;

    public TrickServiceImpl(TrickListRepo trickListRepo) {
        this.trickListRepo = trickListRepo;
        trickListRepo.addTrick(new Trick("Jump"));
        trickListRepo.addTrick(new Trick("Code in Java"));
        trickListRepo.addTrick(new Trick("Swim"));
        trickListRepo.addTrick(new Trick("Run"));
        trickListRepo.addTrick(new Trick("Hide"));
    }

    @Override
    public void addTrick(Trick trick) {
        trickListRepo.addTrick(trick);
    }

    @Override
    public Trick findTrick(String name) {
        return trickListRepo.findTrick(name);
    }

    @Override
    public List<Trick> findAll() {
        return trickListRepo.findAll();
    }

}
