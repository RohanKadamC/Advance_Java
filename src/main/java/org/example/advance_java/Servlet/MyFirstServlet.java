package org.example.advance_java.Servlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/hello")
public class MyFirstServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>My First Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Welcome to Advanced Java!</h1>");
        out.println("<p>This is my first Servlet program.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}


