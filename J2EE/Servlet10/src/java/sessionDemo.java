import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class sessionDemo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession(true);
            Date createTime = new Date(session.getCreationTime());
            Date lastAccessTime = new Date(session.getLastAccessedTime());
            String title = "Welcome Back to my website";
            Integer visitCount = 0;
            String visitCountKey = "visitCount";
            String userIDKey = "userID";
            String userID = "Anshu";
            if (session.isNew())
            {
               title = "Welcome to my website";
               session.setAttribute(userIDKey, userID);
            }
            else
            {
               visitCount = (Integer)session.getAttribute(visitCountKey);
               visitCount = visitCount + 1;
               userID = (String)session.getAttribute(userIDKey);
            }
            session.setAttribute(visitCountKey,  visitCount);
            out.println("<h1>" + title + "</h1><br>");
            out.println("<h2>Session Information</h2><br>");
            out.println("ID: " + session.getId() + "<br>");
            out.println("Creation Time: " + createTime + "<br>");
            out.println("Last Access: " + lastAccessTime + "<br>");
            out.println("User: " + userID + "<br>");
            out.println("Number of visits: " + visitCount + "<br>");
            out.println("<a href='../Servlet10/index.html'>Go Home</a>");
        }
    }
}