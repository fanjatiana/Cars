package com.example.tp_cars;

import com.example.tp_cars.dao.AdminJdbcDao;
import com.example.tp_cars.model.Admin;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userRole = req.getParameter("userRole");
        String password = req.getParameter("password");
        HttpSession session = req.getSession();
        req.setAttribute("isError", "");
        Admin admin = new AdminJdbcDao().findAdminByRoleAndPassword(userRole,password);
        if (admin != null) {
            session.setAttribute("userRole", userRole);
            System.out.println(session.getAttribute("userRole"));
            req.setAttribute("isError", "");
            resp.sendRedirect(req.getContextPath() + "/adminSession/admin-home-page");
        } else {
            req.setAttribute("isError", "Oops utilisateur ou mot de passe inconnu");
            req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
            session.invalidate();
        }
    }
}
