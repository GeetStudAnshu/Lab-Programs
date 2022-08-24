import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  

public class edit2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException 
    {  
        response.setContentType("text/html");  
        try(PrintWriter out=response.getWriter()) 
        {
            String sid=request.getParameter("id");  
            int id=Integer.parseInt(sid);  
            String name=request.getParameter("name"); 
            String email=request.getParameter("email");  
            String country=request.getParameter("country");  
          
            user u=new user();  
            u.setId(id);  
            u.setName(name); 
            u.setEmail(email);  
            u.setCountry(country);  

            int status = userdao.update(u);  
            if(status>0)
            {  
                response.sendRedirect("../Servlet14/view");
            }
            else
            {  
                out.println("Sorry! unable to update record");  
            }  
            out.close();  
        }
    }  
}  