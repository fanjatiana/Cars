package com.example.tp_cars;

import com.example.tp_cars.dao.CarJdbcDao;
import com.example.tp_cars.model.Car;
import com.example.tp_cars.service.CarsService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;
import java.util.Set;

@WebServlet(urlPatterns = "/category-list")
public class categoryListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarsService carsService = new CarsService();
        Set<String> category = carsService.fetchAllCategory();
        req.setAttribute("category", category);
        req.getRequestDispatcher("/WEB-INF/category-list.jsp").forward(req, resp);
    }
}
