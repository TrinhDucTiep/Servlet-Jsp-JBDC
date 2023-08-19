package com.example.cc;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", urlPatterns = {"/hello-servlet", "/tiep"})
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        System.out.println("called do get");

        // forwarding to XML page
//        getServletContext().getRequestDispatcher("/food").forward(request, response);

        // redirect to youtube
        response.sendRedirect("https://www.youtube.com/");
    }

    public void destroy() {
    }
}