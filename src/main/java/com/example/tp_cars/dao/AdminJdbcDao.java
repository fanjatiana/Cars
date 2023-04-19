package com.example.tp_cars.dao;



import com.example.tp_cars.model.Admin;
import com.example.tp_cars.model.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AdminJdbcDao implements AdminDao {

    @Override
    public Admin findAdminByRoleAndPassword(String role, String password) {
        Admin userLogin = null;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        Connection connection = ConnexionManager.getINSTANCE();
        try {
            preparedStatement = connection.prepareStatement("SELECT id,role, password FROM administrators WHERE role = ? AND password = ?");
            preparedStatement.setString(1, role); // définir des paramètre
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                userLogin = new Admin(resultSet.getString("role"), resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userLogin;
    }


    @Override
    public boolean create(Admin entity) {
        return false;
    }

    @Override
    public List<Admin> findAll() {
        return null;
    }

    @Override
    public Admin findById(Integer integer) {
        return null;
    }

    @Override
    public void update(Admin entity) {

    }

    @Override
    public void delete(Admin entity) {

    }
}
