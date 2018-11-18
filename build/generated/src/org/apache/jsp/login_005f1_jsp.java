package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("        var REST_URL = \"http://localhost:11233/ProjetoKiccWebService/webresources/clientes\";\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            $(\"#pesquisar\").click(function() {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("            type: \"GET\",\r\n");
      out.write("                    url: REST_URL + \"/\" + $(\"#email\").val() + \"/\" + $(\"#senha\").val(),\r\n");
      out.write("                    success: function(results) {\r\n");
      out.write("                        console.log(results);\r\n");
      out.write("                    if(results === \"ok\"){\r\n");
      out.write("                        alert('ok');\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert('erro' + results);\r\n");
      out.write("                    }\r\n");
      out.write("        \r\n");
      out.write("        //$(\"#resposta\").html(data);\r\n");
      out.write("                    }\r\n");
      out.write("            });\r\n");
      out.write("                    return (false);\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("                    $(\"#excluir\").click(function() {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("            type: \"DELETE\",\r\n");
      out.write("                    url: REST_URL + \"/\" + $(\"#id\").val(),\r\n");
      out.write("                    success: function(data) {\r\n");
      out.write("                    var resposta = $(data).find(\"resposta\");\r\n");
      out.write("                            $(\"#resposta\").html(resposta);\r\n");
      out.write("                    }\r\n");
      out.write("            });\r\n");
      out.write("                    return (false);\r\n");
      out.write("            });\r\n");
      out.write("            $(\"#listar\").click(function() {\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                type: \"GET\",\r\n");
      out.write("                    url: REST_URL,\r\n");
      out.write("                    success: function(data) {\r\n");
      out.write("                    var resposta = \"<table border='1'>\";\r\n");
      out.write("                            for (i in data) {\r\n");
      out.write("                    resposta += \"<tr>\";\r\n");
      out.write("                            resposta += \"<td>\" + data[i].id + \"</td>\";\r\n");
      out.write("                            resposta += \"<td>\" + data[i].userName + \"</td>\";\r\n");
      out.write("                            resposta += \"<td>\" + data[i].address + \"</td>\";\r\n");
      out.write("                            resposta += \"<td>\" + data[i].email + \"</td>\";\r\n");
      out.write("                            resposta += \"<tr>\";\r\n");
      out.write("                    }\r\n");
      out.write("                    resposta += \"</table>\";\r\n");
      out.write("                            $(\"#resposta\").html(resposta);\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                return (false);\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Usuários</h1>\r\n");
      out.write("        <form id=\"form1\" name=\"form1\" method=\"POST\">\r\n");
      out.write("            Email: <input type=\"text\" name=\"email\" id=\"email\" /><br/>\r\n");
      out.write("            Senha: <input type=\"text\" name=\"senha\" id=\"senha\" /><br/><br/>\r\n");
      out.write("            <input type=\"button\" id=\"pesquisar\" value=\"Pesquisar\" />\r\n");
      out.write("            <input type=\"button\" id=\"listar\" value=\"Listar\" />\r\n");
      out.write("            <input type=\"button\" id=\"excluir\" value=\"Excluir\" />\r\n");
      out.write("            <br/>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <div id=\"resposta\"></div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
