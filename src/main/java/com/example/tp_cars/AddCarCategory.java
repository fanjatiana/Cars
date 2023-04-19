package com.example.tp_cars;


import com.example.tp_cars.dao.CarJdbcDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/adminSession/form-add-category")
public class AddCarCategory extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/form-add-category.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type=req.getParameter("type");

        boolean newCategoryAdded = false;
        try {
            newCategoryAdded = new CarJdbcDao().createCategory(type);
            if(newCategoryAdded){
                resp.sendRedirect(req.getContextPath() + "/adminSession/form-add-category");
            }else{
                System.out.println("error!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
