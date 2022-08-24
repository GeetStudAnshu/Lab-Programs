import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class aRefresh extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            response.setIntHeader("Refresh", 1);
            Calendar calendar = new GregorianCalendar();
            String am_pm;
            int hour = calendar.get(Calendar.HOUR);
            int minute = calendar.get(Calendar.MINUTE);
            int second = calendar.get(Calendar.SECOND);
            if(calendar.get(Calendar.AM_PM) == 0)
               am_pm = "AM";
            else
               am_pm = "PM";
            String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
            out.println("<h1 align='center'>Auto Refresh Page</h1><hr>");
            out.println("<h3 align='center'>Current time: "+CT+"</h3>");
        }
    }
}
