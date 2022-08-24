import java.io.*;
import javax.servlet.*;

public class SLC extends GenericServlet {
    private String str;
    @Override
    public void init() {
        str = "Servlet Called From HTML Page!";
        System.out.println("Servlet Started");
    }
    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException { 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(str);
    }

    @Override
    public void destroy() {
        System.out.print("Servlet Destoryed");
    }
}
