import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class cookies2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            Cookie ck[]=request.getCookies();
            out.print("The Fruit is: "+ck[0].getValue());
        }
    }
}
