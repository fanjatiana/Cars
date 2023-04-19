package com.example.tp_cars.service;

import com.example.tp_cars.dao.CarJdbcDao;
import com.example.tp_cars.model.Car;

import java.util.List;

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
    // methode createNewCars
}
