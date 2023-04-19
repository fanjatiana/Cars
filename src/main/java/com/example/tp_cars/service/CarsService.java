package com.example.tp_cars.service;

import com.example.tp_cars.dao.CarJdbcDao;
import com.example.tp_cars.model.Car;

import java.util.List;

public class CarsService {
    public List<Car> fetchAllCars() {
        List<Car> dataCars = new CarJdbcDao().findAll();
        return dataCars;
    }

    // methode createNewCars
}
