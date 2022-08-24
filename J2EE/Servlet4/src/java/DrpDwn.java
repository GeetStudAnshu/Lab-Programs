import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DrpDwn extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            String c = request.getParameter("veggies");          
            out.print("<b>Selected Vegetable: </b>");
            out.println(c);
        }
    }
}