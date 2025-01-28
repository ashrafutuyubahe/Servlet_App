package com.servletExample;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;

public class TotalServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        
        // String sumParam = req.getParameter("sum");
        HttpSession sumParam= req.getSession();
        int total= (int)sumParam.getAttribute("total");
        // Integer total = null;

       
        PrintWriter out = res.getWriter();
        out.print("<h1> after redirect ,using session The total is: " + total + "</h1>");
        // if (total != null) {
        //     out.print("<h1> after redirect ,The total is: " + total + "</h1>");
        // } else {
        //     out.print("<h1>Error: Unable to retrieve the total.</h1>");
        // }
    }
}
