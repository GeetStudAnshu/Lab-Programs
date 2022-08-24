import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SysInfo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            java.util.Date date = new java.util.Date();
            out.println("<h2>"+"Current Date & Time: " +date.toString()+"</h2>");
        }
    }
}
