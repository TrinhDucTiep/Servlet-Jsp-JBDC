package com.example.cc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NameServlet", urlPatterns = {"/name"})
public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get parameters form request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        if(firstName == null || lastName == null) {
            response.getWriter().println("You have not provided a full name");
        } else {
            response.getWriter().println("Hello " + firstName + " " + lastName + " , nice to meet you");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
