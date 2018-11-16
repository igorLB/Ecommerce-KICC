package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class meus_005fdados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var REST_URL = \"http://localhost:11233/ProjetoKiccWebService/webresources/clientes\";\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                //$(\"#listar\").click(function() {\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"GET\",\n");
      out.write("                    url: REST_URL,\n");
      out.write("                    success: function (data) {\n");
      out.write("                        var resposta = \"<table border='1'>\";\n");
      out.write("                        for (i in data) {\n");
      out.write("                            resposta += \"<tr>\";\n");
      out.write("                            resposta += \"<td>\" + data[i].id + \"</td>\";\n");
      out.write("                            resposta += \"<td>\" + data[i].userName + \"</td>\";\n");
      out.write("                            resposta += \"<td>\" + data[i].senha + \"</td>\";\n");
      out.write("                            resposta += \"<td>\" + data[i].email + \"</td>\";\n");
      out.write("                            resposta += \"<tr>\";\n");
      out.write("                        }\n");
      out.write("                        resposta += \"</table>\";\n");
      out.write("                        $(\"#resposta\").html(resposta);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                return (false);\n");
      out.write("                //});\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <label>Email</label><div id=\"resposta\"></div>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
