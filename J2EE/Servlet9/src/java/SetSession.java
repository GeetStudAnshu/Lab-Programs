import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SetSession extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            String s = request.getParameter("txtValue");
            HttpSession session = request.getSession(true);
            session.setAttribute("SessionData",s);
            out.println("Value Stored <b>"+s+"</b>");
        }
    }
}
