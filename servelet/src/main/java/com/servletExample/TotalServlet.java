package com.servletExample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TotalServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        Integer total = (Integer) req.getAttribute("total");

        PrintWriter out = res.getWriter();
        out.print("<h1>The total is: " + total + "</h1>");
    }
}
