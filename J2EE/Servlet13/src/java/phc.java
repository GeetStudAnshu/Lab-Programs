import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class phc extends HttpServlet
{
    private int iHit;
    @Override
    public void init() throws ServletException
     {
          iHit = 0;
     }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter())
        {
            out.println("<center><h3>Welcome to my website !</h3><hr>");
            out.println("You are visitor number: <h1>" + (++iHit) + "</h1></center>");
        }
    }
}