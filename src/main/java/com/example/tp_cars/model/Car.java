package com.example.tp_cars.model;

import java.util.ArrayList;
import java.util.List;

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


    private static List<Car> cars = new ArrayList<>();

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static void setCars(List<Car> cars) {
        Car.cars = cars;
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
