
package tsw;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewServlet extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String na=request.getParameter("em");
            String ps=request.getParameter("ps"); 
           
            if(na.equals("tsw@gmail.com")&&ps.equals("12345"))
            {
                 RequestDispatcher rd=request.getRequestDispatcher("new.jsp");
                rd.forward(request, response);
            }
            else
            {
                 RequestDispatcher rd=request.getRequestDispatcher("signUp.html");
                rd.forward(request, response);
            }
        }
    }

}
