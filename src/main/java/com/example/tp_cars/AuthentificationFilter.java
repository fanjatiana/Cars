package com.example.tp_cars;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebFilter(urlPatterns = "/adminSession")
public class AuthentificationFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = req;
        HttpServletResponse httpServletResponse = res;
        HttpSession httpSession=httpServletRequest.getSession();

        if(httpSession.getAttribute("role") != null && httpSession.getAttribute("password") != null){
            chain.doFilter(req,res);
        }else{
            httpServletResponse.sendRedirect(req.getContextPath() + "/login");
        }
    }
}
