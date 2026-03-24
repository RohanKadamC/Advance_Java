package org.example.advance_java.Servlet;

import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/sessiontrack")
public class SessionTrackingServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        HttpSession session = req.getSession(true);

        // Track page visits
        Integer visitCount = (Integer) session.getAttribute("visitCount");
        if(visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }
        session.setAttribute("visitCount", visitCount);

        // Track first visit time
        Date firstVisit = (Date) session.getAttribute("firstVisit");
        if(firstVisit == null) {
            firstVisit = new Date();
            session.setAttribute("firstVisit", firstVisit);
        }

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Session Tracking</title>");
        out.println("<style>");
        out.println("body { font-family: Arial; margin: 40px; }");
        out.println("table { border-collapse: collapse; width: 60%; }");
        out.println("th, td { border: 1px solid #ddd; padding: 12px; text-align: left; }");
        out.println("th { background: #4CAF50; color: white; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h2>📊 Session Tracking Demo</h2>");
        out.println("<table>");
        out.println("<tr><th>Session Property</th><th>Value</th></tr>");
        out.println("<tr><td>Session ID</td><td>" + session.getId() + "</td></tr>");
        out.println("<tr><td>Creation Time</td><td>" + new Date(session.getCreationTime()) + "</td></tr>");
        out.println("<tr><td>Last Accessed</td><td>" + new Date(session.getLastAccessedTime()) + "</td></tr>");
        out.println("<tr><td>Visit Count</td><td>" + visitCount + "</td></tr>");
        out.println("<tr><td>First Visit</td><td>" + firstVisit + "</td></tr>");
        out.println("<tr><td>Is New Session?</td><td>" + session.isNew() + "</td></tr>");
        out.println("</table>");

        out.println("<p><a href='" + resp.encodeURL("sessiontrack") + "'>🔄 Refresh Page</a></p>");
        out.println("<p><a href='sessiontrack?invalidate=true'>🗑 Invalidate Session</a></p>");

        // Handle invalidation
        if(req.getParameter("invalidate") != null) {
            session.invalidate();
            out.println("<p style='color:red'>✅ Session Invalidated! <a href='sessiontrack'>Start New Session</a></p>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}


