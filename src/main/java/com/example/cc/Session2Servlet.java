package com.example.cc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Session2Servlet", value = "/session2")
public class Session2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // when client connected before, session will be stored at server
        // client will send req enclosed sessionid => server can know and get data equivalent for specific user
        HttpSession httpSession = request.getSession();

        response.getWriter().println("Xin chào " + httpSession.getAttribute("name"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
