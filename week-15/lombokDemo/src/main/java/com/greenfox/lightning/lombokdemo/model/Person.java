package com.greenfox.lightning.lombokdemo.model;

public class Person {
    private String name;
    private String country;
    private int age;
    private boolean isAlive;

    public Person(String name, String country, int age, boolean isAlive) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                '}';
    }
}
