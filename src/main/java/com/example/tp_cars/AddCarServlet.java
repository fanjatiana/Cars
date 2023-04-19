package com.example.tp_cars;

import com.example.tp_cars.dao.CarJdbcDao;
import com.example.tp_cars.model.Car;
import com.example.tp_cars.service.CarsService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/adminSession/form-add-car")
public class AddCarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/form-add-car.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");// recupère la valeur du name des inputs, textarea
        String type=req.getParameter("type");
        String imageUrl = req.getParameter("imageUrl");
        String description = req.getParameter("description");

        float price = Float.parseFloat(req.getParameter("price"));
        System.out.println(price);
        System.out.println(name);
        System.out.println(type);
        System.out.println(imageUrl);
        System.out.println(description);
        Car newcar = new CarsService().createNewCar(name,type,imageUrl,description,price);

        boolean newCarAdded = new CarJdbcDao().create(newcar);
        System.out.println(newCarAdded);
        if (newCarAdded) {
            System.out.println("rentré");
            resp.sendRedirect(req.getContextPath() + "/userSession/admin-home-page");
        } else {
            System.out.println("error!");

        }
    }
}
