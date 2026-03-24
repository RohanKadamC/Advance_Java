package org.example.advance_java.Servlet;

import java.io.*;
import java.util.Date;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/datetime")
public class DateTimeServlet extends HttpServlet {

    @Override
    public void init() {
        System.out.println("✅ DateTimeServlet initialized at " + new Date());
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        System.out.println("✅ DateTimeServlet.doGet() called at " + new Date());
        System.out.println("   Request URL: " + req.getRequestURL());
        System.out.println("   Context Path: " + req.getContextPath());
        System.out.println("   Servlet Path: " + req.getServletPath());

        // Set auto-refresh every 5 seconds
        resp.setIntHeader("Refresh", 1);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Date Time Servlet</title>");
        out.println("<style>");
        out.println("body { font-family: Arial; text-align: center; margin-top: 50px; }");
        out.println(".time { font-size: 48px; color: #4CAF50; }");
        out.println(".date { font-size: 24px; color: #333; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        Date now = new Date();

        out.println("<h1>Current Date and Time</h1>");
        out.println("<div class='date'>" + now + "</div>");
        out.println("<p>Page auto-refreshes every 5 seconds</p>");
        out.println("<p>Servlet Path: " + req.getServletPath() + "</p>");
        out.println("<p>Context Path: " + req.getContextPath() + "</p>");

        out.println("</body>");
        out.println("</html>");
    }
}
