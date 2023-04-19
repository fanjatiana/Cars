package com.example.tp_cars.service;

import com.example.tp_cars.dao.CarJdbcDao;
import com.example.tp_cars.model.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarsService {

    private Car car;
    public List<Car> fetchAllCars() {
        List<Car> dataCars = new CarJdbcDao().findAll();
        return dataCars;
    }

    public Car fetchCarById(int id) {
        new CarJdbcDao().findById(id);
        return car;
    }

    public Set<String> fetchAllCategory() {
       Set<String> allCategory = new HashSet<>();
        List<Car> dataCars = new CarJdbcDao().findAll();
        for (Car c: dataCars){
            allCategory.add(c.getType());
            System.out.println(c.getType());
        }
        return allCategory;

    }

    // methode createNewCars
}
