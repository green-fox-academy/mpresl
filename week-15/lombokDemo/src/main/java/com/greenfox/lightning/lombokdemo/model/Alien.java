package com.greenfox.lightning.lombokdemo.model;

import lombok.*;


//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Alien {
    private String name;
    private String planet;
    private int age;
    private boolean isAlive;
}