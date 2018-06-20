
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
import javax.servlet.http.Cookie;
public class info extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter() ;
        response.setContentType("text/html;charset=UTF-8");
        try {
            
           String name,pass,add,city,email,gen,dob,cont;
        int id;
        name=request.getParameter("na");
        email=request.getParameter("em");
        pass=request.getParameter("ps");
       
 Connection cn;
 PreparedStatement pst;
 Random r=new Random();
 id=r.nextInt(1000);
 Class.forName("org.apache.derby.jdbc.ClientDriver");
 cn=DriverManager.getConnection("jdbc:derby://localhost:1527/tswdb;user=tswdb;password=20071997");
 pst=cn.prepareStatement("insert into tswdb values("+id+",'"+name+"','"+email+"','"+pass+"')");
 int xx=pst.executeUpdate();
 if(xx==1)
 {
     Cookie c=new Cookie("username",name);
     c.setMaxAge(24*60*60);
     response.addCookie(c);
     out.print("Registration Successfully Done !! yours UserID is :  "+id);
 }
 else
 {
     out.print("Error Try Again....");
 }
    }
catch(Exception ex)
{
    out.println(ex);
}
    }

}
