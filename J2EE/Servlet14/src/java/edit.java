import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;

public class edit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        try(PrintWriter out=response.getWriter())
        {
            String sid=request.getParameter("id");  
            int id=Integer.parseInt(sid);  
          
            user u = userdao.getUsersById(id);  
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Update User</title>"); 
            out.println("<link rel='stylesheet' href='lib/css/bootstrap.min.css' type='text/css'>");
            out.println("<script src='lib/js/bootstrap.min.js' type='text/javascript'></script>");
            out.println("</head>");
            out.println("<body style='background-color: #cfe2ff;'>");
            out.println("<h1 class='text-danger text-center m-5 mb-2'>CRUD Application Using Servlets</h1>");  
            out.println("<h1 class='text-primary text-center p-5'>Update User</h1>");
            out.println("<div style='padding: 0 500px;'>");
            out.println("<form action='/Servlet14/edit2' method='post'>");
            out.println("<div class='mb-3'>");
            out.println("<input type='hidden' name='id' value='"+u.getId()+"'/>");
            out.println("<label class='form-label'>Enter Name</label>");
            out.println("<input type='text' class='form-control' name='name' value='"+u.getName()+"' autocomplete='false'>");
            out.println("</div>");
            out.println("<div class='mb-3'>");
            out.println("<label class='form-label'>Enter Email</label>");
            out.println("<input type='email' class='form-control' name='email' value='"+u.getEmail()+"' autocomplete='false'>");
            out.println("</div>");
            out.println("<div class='mb-3'>");
            out.println("<label class='form-label'>Select Country</label>");
            out.println("<select class='form-control' name='country'>");
            out.println("<option>India</option>");
            out.println("<option>USA</option>");
            out.println("<option>UK</option>");
            out.println("<option>UAE</option>");
            out.println("<option>Japan</option>");
            out.println("<option>Canada</option>");
            out.println("<option>Other</option>");
            out.println("<select>");
            out.println("</div>");
            out.println("<input type='submit' class='btn btn-primary' value='Save Changes'>");
            out.println("<button class='btn btn-link'><a href='/Servlet14/view'>View Users</a></button>");
            out.println("</div></form>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
    }  
}  