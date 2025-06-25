package com.example.lists_layouts_images;

public class Pokemon {
    String name;
    String price;
    String power;

    public Pokemon(String name, String price, String power) {
        this.name = name;
        this.price = price;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getPower() {
        return power;
    }
}
