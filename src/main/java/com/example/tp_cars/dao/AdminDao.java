package com.example.tp_cars.dao;

import com.example.tp_cars.model.Admin;
import com.example.tp_cars.model.Car;

public interface AdminDao extends GenericDao<Admin,Integer>{
    Admin findAdminByRoleAndPassword (String role, String password);
}
