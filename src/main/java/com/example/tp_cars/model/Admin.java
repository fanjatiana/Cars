package com.example.tp_cars.model;

public class Admin{
    private int id;
    private String role;
    private String password;


    public Admin(String role, String password) {
        this.id = id;
        this.role = role;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }
}
