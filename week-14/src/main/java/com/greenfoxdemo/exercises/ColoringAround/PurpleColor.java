package com.greenfoxdemo.exercises.ColoringAround;

import com.greenfoxdemo.exercises.HelloDIproject.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurpleColor implements MyColor {

    private final Printer printer;
    @Autowired
    public PurpleColor(Printer printer){ // Constuctor Injecting
        this.printer = printer;
    }

    @Override
    public void printColor() {
//        System.out.println("It is the best color!");
        printer.log("Purple is the best color!");
    }
}
