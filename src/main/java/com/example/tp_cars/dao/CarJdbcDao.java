package com.example.tp_cars.dao;

import com.example.tp_cars.model.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarJdbcDao implements CarDao {

    List<Car> carList = new ArrayList<>();

    @Override
    public List<Car> findAll() {
        try {
            Connection connection = ConnexionManager.getINSTANCE();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id,name,type,imageUrl,description,price FROM cars");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String type = resultSet.getString("type");
                String imageUrl = resultSet.getString("imageUrl");
                String description = resultSet.getString("description");
                float price = resultSet.getFloat("price");

                Car cars = new Car(id, name, type, imageUrl, description,price);
                cars.getId();
                cars.getName();
                cars.getType();
                cars.getImageUrl();
                cars.getDescription();
                cars.getPrice();
                carList.add(cars);
            }
            //ConnexionManager.closeConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return carList;
    }
    @Override
    public Car findAllCarsFromBdd(String name, String type, String imageUrl, String description, float price) {
        return null;
    }

    @Override
    public Car createACar(String name, String type, String imageUrl, String description, float price) {
        return null;
    }

    @Override
    public boolean create(Car entity) {
        return false;
    }



    @Override
    public Car findById(Integer integer) {
        return null;
    }

    @Override
    public void update(Car entity) {

    }

    @Override
    public void delete(Car entity) {

    }
}
