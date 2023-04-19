package com.example.tp_cars;

import com.example.tp_cars.dao.AdminJdbcDao;
import com.example.tp_cars.model.Admin;
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

@WebServlet(urlPatterns = "/adminSession/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/logout.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String buttonChoice = req.getParameter("rester") != null ? "rester" : "quitter";
        if (buttonChoice.equals("rester")) {
            session.setAttribute("choice", buttonChoice);
            resp.sendRedirect(req.getContextPath()+ "/adminSession/admin-home-page");
        } else if (buttonChoice.equals("quitter")) {
            HttpSession httpSession=req.getSession();
            httpSession.invalidate();
            resp.sendRedirect(req.getContextPath()+"/Home");
        }
    }
}
