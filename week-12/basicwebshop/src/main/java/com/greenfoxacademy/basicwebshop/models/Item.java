package com.greenfoxacademy.basicwebshop.models;

public class Item {
    private String name;
    private String description;
    private long price;
    private int stock;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Item(String name, String description, long price, int stock, String type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.type = type;
    }

    public long priceInCzk(){
        double czkPrice = this.price * 21.89;
        long czk = (long) czkPrice;
        return czk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
