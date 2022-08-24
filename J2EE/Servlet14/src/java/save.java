import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;
public class save extends HttpServlet { 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException 
    {  
        response.setContentType("text/html");  
        try (PrintWriter out = response.getWriter()) 
        {
            String name=request.getParameter("name");
            String email=request.getParameter("email");
            String country=request.getParameter("country");
            user u=new user();
            u.setName(name);
            u.setEmail(email);
            u.setCountry(country);
            
            int status = userdao.save(u);
            if(status>0)
            {
                out.println("<script>alert('Woopie! User is added!');</script>");
                request.getRequestDispatcher("index.html").include(request, response);  
            }
            else
            {
               out.println("<script>alert('Oops! User can't be added!');</script>"); 
            }
        }
    }  
}  