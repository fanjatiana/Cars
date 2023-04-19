package com.example.tp_cars.model;

public class Car {
    private int id;
    private String name;

    private String type;

    private String imageUrl;

    private String description;
    private float price;

    public Car(int id, String name, String type, String imageUrl, String description, float price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.imageUrl = imageUrl;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }
}
