import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class URLRewrite extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            String d=request.getParameter("Data");
            out.println("Value passed is "+d);
        }
    }
}
