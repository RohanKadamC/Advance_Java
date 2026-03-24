package org.example.advance_java.Servlet;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cookieManager")
public class CookieManagerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String action = req.getParameter("action");

        if("create".equals(action)) {
            Cookie userCookie = new Cookie("username", "john_doe");
            userCookie.setMaxAge(24 * 60 * 60); // 1 day
            resp.addCookie(userCookie);
            resp.getWriter().write("Cookie created!");
        }
    }
}

