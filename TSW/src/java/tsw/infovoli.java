
package tsw;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
public class infovoli extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter() ;
        response.setContentType("text/html;charset=UTF-8");
        try {
            
           String name,contact,city,profession,experience,email;
        int id;
        name=request.getParameter("na");
        email=request.getParameter("em");
        contact=request.getParameter("con");
          city=request.getParameter("city");
            profession=request.getParameter("proff");
              experience=request.getParameter("exp");
       if(name.equals("")|| email.equals("")||contact.equals("")||city.equals("")|| profession.equals("")||experience.equals(""))
       {
       out.println("Feilds cannot be empty");
       RequestDispatcher rd=request.getRequestDispatcher("404.html");
     rd.forward(request, response);}
       else{
 Connection cn;
 PreparedStatement pst;
 Random r=new Random();
 id=r.nextInt(100000);
 Class.forName("org.apache.derby.jdbc.ClientDriver");
 cn=DriverManager.getConnection("jdbc:derby://localhost:1527/tswdb;user=tswdb;password=20071997");
 pst=cn.prepareStatement("insert into volidata values("+id+",'"+name+"','"+email+"','"+contact+"','"+city+"','"+profession+"','"+experience+"')");
 int xx=pst.executeUpdate();
 if(xx==1)
 {
     Cookie c=new Cookie("username",name);
     c.setMaxAge(24*60*60);
     response.addCookie(c);
     RequestDispatcher rd=request.getRequestDispatcher("regsuccess.html");
     rd.forward(request, response);
 }
 else
 {
     out.print("Error Try Again....");
     RequestDispatcher rd=request.getRequestDispatcher("404.html");
     rd.forward(request, response);
 }
    }}
catch(Exception ex)
{
    out.println(ex);
    RequestDispatcher rd=request.getRequestDispatcher("404.html");
     rd.forward(request, response);
}
    }
    
}
