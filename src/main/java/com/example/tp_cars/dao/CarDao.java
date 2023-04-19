package com.example.tp_cars.dao;

import com.example.tp_cars.model.Car;

public interface CarDao extends GenericDao<Car,Integer> {
    Car findAllCarsFromBdd(String name, String type, String imageUrl, String description, float price);
    Car createACar(String name, String type, String imageUrl, String description, float price);

    Car findById(Integer id);
}