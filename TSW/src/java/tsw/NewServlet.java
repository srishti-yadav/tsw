
package tsw;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class NewServlet extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        try 
        {
            String email,pass;
             email=request.getParameter("em");
        pass=request.getParameter("ps");
            Connection cn;
 PreparedStatement pst,pst1;

 Class.forName("org.apache.derby.jdbc.ClientDriver");
 cn=DriverManager.getConnection("jdbc:derby://localhost:1527/tswdb;user=tswdb;password=20071997");
 pst=cn.prepareStatement("select * from tswdb where email='"+email+"' and password='"+pass+"'");
 ResultSet rs;
 rs=pst.executeQuery();
 if(rs.next())
 {
     HttpSession session=request.getSession(true);
     session.setAttribute("name", email);
     
      HttpSession session1=request.getSession(true);
      Date d=new Date();
     session1.setAttribute("logintime", d.toString());
     Random r=new Random();
     int lid=r.nextInt(1000);
     pst1=cn.prepareStatement("insert into logdata values("+rs.getInt(3)+","+lid+",'"+email+"','"+d+"')");
     int x=pst1.executeUpdate();
     if(x==1)
     {
         out.println("Save");
     }
     else
     {
         out.print("Not save..");
     }
     RequestDispatcher rd=request.getRequestDispatcher("writeup.html");
     rd.forward(request, response);
     
 }
 else
 {
     out.println("Wrong UserID Or Password Try Again");
     RequestDispatcher rd=request.getRequestDispatcher("login.html");
     rd.forward(request, response);
 }
 
        }
        catch(Exception ex)
        {
            out.println(ex);
        }
    }

 

}
