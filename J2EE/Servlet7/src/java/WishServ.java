import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WishServ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            String sName = request.getParameter("txtName");
            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            if(hour<12)
                 out.println("Good Morning, " + sName);
            else if (hour < 16)
                 out.println("Good afternoon " + sName);
            else if(hour<20) 
                 out.println("Good evening " + sName);
            else
                 out.println("Good night " + sName);

            out.println("<br><br><a href= '../Servlet7/index.html'>Home</a>");
        }
    }
}
