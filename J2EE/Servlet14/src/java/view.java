import java.io.*;  
import java.util.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  

public class view extends HttpServlet 
{  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        try(PrintWriter out=response.getWriter())
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>View Users</title>"); 
            out.println("<link rel='stylesheet' href='lib/css/bootstrap.min.css' type='text/css'>");
            out.println("<script src='lib/js/bootstrap.min.js' type='text/javascript'></script>");
            out.println("</head>");
            out.println("<body style='background-color: #cfe2ff;'>");
            out.println("<h1 class='text-danger text-center m-5 mb-2'>CRUD Application Using Servlets</h1>");  
            out.println("<h1 class='text-primary text-center p-5'>User List</h1>");  
            List<user> list;  
            list = userdao.getAllUsers();
            out.println("<div style='padding: 0 200px;'><table class='table table-striped table-warning table-bordered'>");  
            out.println("<tr><th>#</th><th>Name</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");  
            for(user e:list){  
                out.println("<tr>");
                out.println("<td>"+e.getId()+"</td>");
                out.println("<td>"+e.getName()+"</td>");
                out.println("<td>"+e.getEmail()+"</td>");
                out.println("<td>"+e.getCountry()+"</td>");
                out.println("<td><a class='text-primary' href='../Servlet14/edit?id="+e.getId()+"'>Edit</a></td>");
                out.println("<td><a class='text-danger' href='../Servlet14/delete?id="+e.getId()+"'>Delete</a></td>");
                out.println("</tr>");  
            }
            out.println("</table></div>");
            out.println("<p class='text-center p-5'><a class='link-danger' href='index.html'>Add More User</a></p>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
    }  
}  