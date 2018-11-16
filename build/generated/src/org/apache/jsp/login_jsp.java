package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("            $(document).ready(function() {\n");
      out.write("\n");
      out.write("                $(\"#entrar\").click(function() {\n");
      out.write("                    $.ajax({\n");
      out.write("                    type: \"GET\",\n");
      out.write("                        url: REST_URL + \"/\" + $(\"#email\").val(),\n");
      out.write("                        success: function(data) {\n");
      out.write("                        $(\"#resposta\").html(data);\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("                return (false); \n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <p>Identifique-se</p>\n");
      out.write("        <form method=\"POST\" id=\"login\" name=\"login\">\n");
      out.write("\n");
      out.write("            <label>Email</label>\n");
      out.write("            <input type=\"text\" id=\"email\" name=\"email\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$\"  required=\"required\" placeholder=\"email@dominio.com\"/>\n");
      out.write("            <br>\n");
      out.write("            <label>Senha</label>\n");
      out.write("            <input type=\"password\" id=\"senha\" name=\"senha\" placeholder=\"*******\"><br>\n");
      out.write("            <a href=\"senha.jsp\">Esqueceu sua senha?</a><br>\n");
      out.write("            <button type=\"submit\" name=\"entrar\" id=\"entrar\">Entrar</button>\n");
      out.write("        </form>\n");
      out.write("<div id=\"resposta\"></div>\n");
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
