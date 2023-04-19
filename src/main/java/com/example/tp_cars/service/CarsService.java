package com.example.tp_cars.service;

import com.example.tp_cars.dao.CarJdbcDao;
import com.example.tp_cars.model.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarsService {
    private int id = 0;
    private Car car;
    public List<Car> fetchAllCars() {
        List<Car> dataCars = new CarJdbcDao().findAll();
        return dataCars;
    }

    public Car fetchCarById(int id) {
       return new CarJdbcDao().findById(id);
    }

    public Set<String> fetchAllCategory() {
       Set<String> allCategory = new HashSet<>();
        List<Car> dataCars = new CarJdbcDao().findAll();
        for (Car c: dataCars){
            allCategory.add(c.getType());
        }
        return allCategory;
    }

    public Car createNewCar(String name, String type, String imageUrl, String description, float price) {
        Car newCar= new Car(++id, name, type, imageUrl,description,price);
        return newCar;
    }
}
