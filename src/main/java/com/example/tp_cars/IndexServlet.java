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
     //Car car = new CarsService().fetchCarById(Integer.parseInt(btnId));
     session.setAttribute("buttonId", btnId);
      System.out.println(session+"sgsdg");
      System.out.println( session);
        resp.sendRedirect(req.getContextPath() + "/details");

       /* if (car != null) {
            req.setAttribute("car", car);

        } else {
            req.getRequestDispatcher("/WEB-INF/").forward(req, resp);
            session.invalidate();
        }*/
    }
}