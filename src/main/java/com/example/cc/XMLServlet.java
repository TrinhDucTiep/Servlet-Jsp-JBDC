package com.example.cc;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

// this class show another way to map servlets to url pattern by using xml instead of annotation
public class XMLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("Call Get in XML Servlet");
        response.getWriter().println("This is XML page");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Call Post in XML Servlet");
    }
}
