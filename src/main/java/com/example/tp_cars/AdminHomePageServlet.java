package com.example.tp_cars;

import com.example.tp_cars.model.Car;
import com.example.tp_cars.service.CarsService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/adminSession/admin-home-page")
public class AdminHomePageServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarsService carsService = new CarsService();
        List<Car> cars = carsService.fetchAllCars();
        req.setAttribute("cars", cars);
        req.getRequestDispatcher("/WEB-INF/admin-home-page.jsp").forward(req, resp);
    }
}
