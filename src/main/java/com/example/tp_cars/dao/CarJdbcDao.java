package com.example.tp_cars.dao;

import com.example.tp_cars.model.Car;

import java.sql.*;
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

                Car cars = new Car(id, name, type, imageUrl, description, price);
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
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        Connection connection = ConnexionManager.getINSTANCE();
        boolean insertOk = false;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO cars (name, type, imageUrl,description,price) VALUES (?,?,?,?,?)");
            preparedStatement.setString(1, entity.getName()); // définir des paramètre
            preparedStatement.setString(2, entity.getType());
            preparedStatement.setString(3, entity.getImageUrl());
            preparedStatement.setString(4, entity.getDescription());
            preparedStatement.setFloat(5, entity.getPrice());
            int rowsAffected = preparedStatement.executeUpdate();
            insertOk = rowsAffected > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return insertOk;
    }

    public boolean createCategory(String type) throws SQLException {
        PreparedStatement preparedStatement;
        Connection connection = ConnexionManager.getINSTANCE();
        boolean insertOk = false;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO cars (type) VALUES (?)");
            preparedStatement.setString(1, type);
            int rowsAffected = preparedStatement.executeUpdate();
            insertOk = rowsAffected > 0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return insertOk;
    }

    @Override
    public Car findByCategory(String type) {
        return null;
    }

    @Override
    public Car findById(Integer carId) {
        Car thisCar = null;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        Connection connection = ConnexionManager.getINSTANCE();
        try {
            preparedStatement = connection.prepareStatement("SELECT id,name,type,imageUrl,description,price FROM cars WHERE id = ?");
            preparedStatement.setInt(1, carId); // définir des paramètre
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                thisCar = new Car(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("type"),
                        resultSet.getString("imageUrl"), resultSet.getString("description"), resultSet.getFloat("price"));
                System.out.println(thisCar);
                return thisCar;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Car entity) {

    }

    @Override
    public void delete(Car entity) {

    }
}
