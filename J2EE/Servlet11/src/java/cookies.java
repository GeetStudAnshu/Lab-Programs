import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class cookies extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            String s = request.getParameter("fName");
            out.print("Entered Fruit is: "+s);

            Cookie ck=new Cookie("fname",s);
            response.addCookie(ck);
            
            out.println("<form action='/Servlet11/cookies2' method='post'>");
            out.println("<input type='submit' value='Go'>");
            out.println("</form>");
        }
    }
}
