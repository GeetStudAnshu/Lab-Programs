import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MultiPara extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            Enumeration enu=request.getParameterNames();
		while(enu.hasMoreElements()) {
			String pname=(String)enu.nextElement();
			out.print("<br>"+pname+" = ");
			String pvalue=request.getParameter(pname);
			out.println(pvalue);
		}
        }
    }
}
