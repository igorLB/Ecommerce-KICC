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

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cabecalho.jsp", out, false);
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        $(\"#submit1\").hover(\r\n");
      out.write("                function () {\r\n");
      out.write("                    $(this).animate({\"opacity\": \"0\"}, \"slow\");\r\n");
      out.write("                },\r\n");
      out.write("                function () {\r\n");
      out.write("                    $(this).animate({\"opacity\": \"1\"}, \"slow\");\r\n");
      out.write("                });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>\t\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    var REST_URL = \"http://localhost:11233/ProjetoKiccWebService/webresources/clientes\";\r\n");
      out.write("\r\n");
      out.write("    $(\"#logar\").click(function () {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type: \"GET\",\r\n");
      out.write("            url: REST_URL + \"/\" + $(\"#email\").val() + \"/\" + $(\"#senha\").val(),\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("\r\n");
      out.write("                if (data === \"200\") {\r\n");
      out.write("                    alert('ok');\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert('erro');\r\n");
      out.write("                    //window.location.href = \"../recupSenha\";\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                //$(\"#resposta\").html(data);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        return (false);\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("            <div id=\"wrappertop\"></div>\r\n");
      out.write("            <div id=\"wrappermiddle\">\r\n");
      out.write("                <h2>Login</h2>\r\n");
      out.write("                <div id=\"username_input\">\r\n");
      out.write("                    <div id=\"username_inputleft\"></div>\r\n");
      out.write("                    <div id=\"username_inputmiddle\">\r\n");
      out.write("                        <form id=\"login\" name=\"login\">\r\n");
      out.write("                            <input type=\"text\" name=\"email\" id=\"email\" value=\"E-mail Address\" onclick=\"this.value = ''\">\r\n");
      out.write("                            <img id=\"url_user\" src=\"./images/mailicon.png\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"username_inputright\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"password_input\">\r\n");
      out.write("                        <div id=\"password_inputleft\"></div>\r\n");
      out.write("                        <div id=\"password_inputmiddle\">\r\n");
      out.write("\r\n");
      out.write("                            <input type=\"password\" name=\"senha\" id=\"senha\" value=\"Password\" onclick=\"this.value = ''\">\r\n");
      out.write("                            <img id=\"url_password\" src=\"./images/passicon.png\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"password_inputright\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"submit\">\r\n");
      out.write("                        <input type=\"submit\" id=\"logar\" name=\"logar\" value=\"Entrar\">\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"image\" src=\"./res/images/submit_hover.png\" id=\"submit1\" value=\"Entrar\">\r\n");
      out.write("                        <input type=\"image\" src=\"./res/images/submit.png\" id=\"submit2\" value=\"Entrar\">\r\n");
      out.write("                        \r\n");
      out.write("                                                </form>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"links_left\">\r\n");
      out.write("                        <a href=\"#\">Esqueceu a senha?</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"links_right\"><a href=\"#\">NÃ£o Ã© cadastrado ainda?</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"wrapperbottom\"></div>\r\n");
      out.write("                <div id=\"powered\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>");
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
