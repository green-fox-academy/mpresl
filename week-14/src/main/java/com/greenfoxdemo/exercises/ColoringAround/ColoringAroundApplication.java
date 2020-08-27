package com.greenfoxdemo.exercises.ColoringAround;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan({"com.greenfoxdemo.exercises.HelloDIproject", "com.greenfoxdemo.exercises.ColoringAround" }) //also scans these packages
public class ColoringAroundApplication implements CommandLineRunner { //WILL NOT BE ON FINAL EXAM!!!1 {

    private final MyColor myColor;

    @Autowired
    public ColoringAroundApplication(MyColor myColor){
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(ColoringAroundApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myColor.printColor();
    }
}
