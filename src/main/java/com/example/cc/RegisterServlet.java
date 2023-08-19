package com.example.cc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");

        if(email == null || name == null || age == null || password == null || repassword == null
         || email.isEmpty() || name.isEmpty() || age.isEmpty() || password.isEmpty() || repassword.isEmpty()) {
            request.setAttribute("error", "You are missing of the inputs");
            doGet(request, response);
        } else {
            if(!password.equals(repassword)) {
                request.setAttribute("error", "The password does not match");
                doGet(request, response);
            } else {
                response.getWriter().println("Register successfully " + email + " " + name + " " + age + " " + password + " " + repassword);
            }
        }

    }
}
