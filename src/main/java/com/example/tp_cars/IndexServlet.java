package com.example.tp_cars;

import java.io.*;
import java.util.List;

import com.example.tp_cars.dao.CarJdbcDao;
import com.example.tp_cars.model.Car;
import com.example.tp_cars.service.CarsService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(urlPatterns = {"/", "/Home"})
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarsService carsService = new CarsService();
        List<Car> cars = carsService.fetchAllCars();
        req.setAttribute("cars", cars);
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String btnId = req.getParameter("btnDetails");
        HttpSession session = req.getSession();
        session.setAttribute("buttonId", btnId);
        System.out.println("id session" + session + " " + btnId);

        Car car = new CarJdbcDao().findById(Integer.valueOf(btnId));
        System.out.println(car.getPrice());
        String name = car.getName();
        String type = car.getType();
        String description = car.getDescription();
        String imageUrl = car.getImageUrl();
        Float price = car.getPrice();

        req.setAttribute("name", name);
        req.setAttribute("type", type);
        req.setAttribute("description", description);
        req.setAttribute("imageUrl", imageUrl);
        req.setAttribute("price", price);

        req.getRequestDispatcher("/WEB-INF/details.jsp").forward(req, resp);
        resp.sendRedirect(req.getContextPath() + "/details");

    }
}