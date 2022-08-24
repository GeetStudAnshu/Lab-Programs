import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TBServ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            String sName = request.getParameter("txtName");
            String sTaste = request.getParameter("txtTaste");
            out.println("Fruit: <b>"+sName+"</b>");
            out.println("<br>Taste: <b>"+sTaste+"</b>");
        }
    }
}
