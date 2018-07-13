package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class submit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    \t\t<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("    <style>\n");
      out.write("       \n");
      out.write("      .image-icon{\n");
      out.write("         width: 100px;\n");
      out.write("         height: 100px;\n");
      out.write("         border-radius: 50%;\n");
      out.write("             margin: 0px;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .main{\n");
      out.write("            padding: 25px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        .bdy{\n");
      out.write("            padding-top: 30px;\n");
      out.write("            width: 700px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <section id=\"two\" class=\"main style2\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("                    <center>\n");
      out.write("                    <div class=\"major\" id=\"linkss\">\n");
      out.write("                          <img class=\"image-icon\" src =\"images/tsw-icon.jpg\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                    <p> \n");
      out.write("Hi, \n");
      out.print( request.getAttribute("name") );
      out.write(" \n");
      out.write("</p>\n");
      out.write("\t\t\t\t\t<div class=\"bdy\">\n");
      out.write("                        Submit your write up here.\n");
      out.write("                     \n");
      out.write("                        <input style=\"height: 100px\" name='sub'  type=\"text\" placeholder=\"Type / Copy your submission\">\n");
      out.write("                        \n");
      out.write("                        <br>\n");
      out.write("                        \n");
      out.write("                     \n");
      out.write("                        <input style=\"height: 40px\" name='pen'  type=\"text\" placeholder=\"Enter your pen-name over here\">\n");
      out.write("                        \n");
      out.write("                        <br>\n");
      out.write("                        \n");
      out.write("                         <form action=\"#\" onsubmit=\"if(document.getElementById('agree').checked) { return true; } else { alert('Please confirm that all your work is original.'); return false; }\">\n");
      out.write("\n");
      out.write("                             <input type=\"checkbox\" name=\"checkbox\" value=\"check\" id=\"agree\" /> <label style=\"color: white\" for=\"agree\">I hereby declare that my submission is my original work.</label>\n");
      out.write("<input type=\"submit\" name=\"submit\" value=\"submit\" />\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("                        <a href=\"voli.html\">Become a volunteer</a>\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                    </center>\n");
      out.write("            </div>\n");
      out.write("                    \n");
      out.write("\t\t\t</section>\n");
      out.write("        \n");
      out.write("        <section id=\"footer\">\n");
      out.write("\t\t\t\t<ul class=\"icons\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li><a href=\"https://www.facebook.com/thesoulwithin2017/\" target=\"_blank\" class=\"icon alt fa-facebook\"><span class=\"label\">Facebook</span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"https://www.instagram.com/the_soulwithin/?hl=en\" target=\"_blank\" class=\"icon alt fa-instagram\"><span class=\"label\">Instagram</span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"https://www.youtube.com/channel/UC844x6ZH2X0Te_lxX0UKxIg\" target=\"_blank\" class=\"icon alt fa-youtube-play\"><span class=\"label\">Youtube</span></a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<ul class=\"copyright\">\n");
      out.write("\t\t\t\t\t<li>&copy; Copyright:TSW reserves all rights to the content and media of our team/events.\n");
      out.write("We however, aren't liable to the authenticity of content provided by external sources.</li>\n");
      out.write("                    <li>&copy; Developers: Naman Agrawal & Srishti Yadav</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
