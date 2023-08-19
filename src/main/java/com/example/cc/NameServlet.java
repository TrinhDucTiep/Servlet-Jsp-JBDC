package com.example.cc;

import com.example.cc.model.Person;

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
        String age = request.getParameter("age");

//        if(firstName == null || lastName == null) {
//            response.getWriter().println("You have not provided a full name");
//        } else {
//            response.getWriter().println("Hello " + firstName + " " + lastName + " , nice to meet you");
//        }

        if(firstName == null || lastName == null || age == null) {
            response.getWriter().println("You have not provided a full name");
        } else {
            request.setAttribute("person", new Person(firstName, lastName, Integer.parseInt(age)));
            getServletContext().getRequestDispatcher("/name.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
