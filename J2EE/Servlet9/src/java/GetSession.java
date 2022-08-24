import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetSession extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession(true);
            String sValue=session.getAttribute("SessionData").toString();
            out.println("<a href=URLRewrite?Data="+sValue+">Url Rewrite </a>");
            out.println("Session Value is <b>"+sValue+"</b>");
        }
    }
}
