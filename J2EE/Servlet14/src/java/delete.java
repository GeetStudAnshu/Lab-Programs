import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class delete extends HttpServlet {  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException 
    {  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        userdao.delete(id);  
        response.sendRedirect("../Servlet14/view");  
    }  
}  