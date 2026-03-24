package org.example.advance_java.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Dashboard")
public class SessionDashboardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get existing session (do NOT create new)
        HttpSession session = request.getSession(false);

        out.println("<html><body>");

        if (session != null && session.getAttribute("username") != null) {

            String name = (String) session.getAttribute("username");

            out.println("<h2>Dashboard Page</h2>");
            out.println("<h3>BCA IV AJAVA " + name + ", your class is active!</h3>");
            out.println("<p>Session ID: " + session.getId() + "</p>");
            out.println("<br><a href='Login'>Back to Login</a>");

        } else {

            out.println("<h3>No active session found.</h3>");
            out.println("<a href='Login'>Login First</a>");
        }

        out.println("</body></html>");
    }
}
