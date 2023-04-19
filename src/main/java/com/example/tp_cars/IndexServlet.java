package com.example.tp_cars;

import java.io.*;
import java.util.List;

import com.example.tp_cars.model.Car;
import com.example.tp_cars.service.CarsService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(urlPatterns = {"/","/Home"})
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarsService carsService = new CarsService();
        List<Car> cars = carsService.fetchAllCars();
        req.setAttribute("cars", cars);
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }

   /* public void destroy() {
    }*/
}