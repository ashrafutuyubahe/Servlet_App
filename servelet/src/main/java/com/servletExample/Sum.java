package com.servletExample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Sum extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int num1 = Integer.parseInt(req.getParameter("num1"));
            int num2 = Integer.parseInt(req.getParameter("num2"));
            int sum = num1 + num2;

            // req.setAttribute("total", sum);
         
            // resp.setContentType("text/html");
            // resp.getWriter().println("<h1>Sum is: " + sum + "</h1>");
            
         HttpSession  session= req.getSession();
         session.setAttribute("total", sum);
            resp.sendRedirect("total?sum=" + sum); 
        } catch (Exception e) {
            resp.getWriter().println("<h1>Error: Invalid input or calculation.</h1>");
        }
    }
}
