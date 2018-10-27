package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contato_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Meta tags Obrigatórias -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Conteúdo início -->\r\n");
      out.write("\r\n");
      out.write("        <h3>Contate-nos</h3>\r\n");
      out.write("        <br> <br> \r\n");
      out.write("        <form id=\"form1\" method=\"post\" action=\"EnviaEmailServlet\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Nome -->\r\n");
      out.write("\r\n");
      out.write("            <label id=\"texto\">Nome <span class=\"alerta\"></span>*</label><br> \r\n");
      out.write("            <input type=\"text\" class=\"form-control col-md-10  border border-dark\" id=\"nome\" name=\"nome\"  maxlength=\"40\" value=\"\" required=\"required\">\r\n");
      out.write("            <br> <br> \r\n");
      out.write("\r\n");
      out.write("            <!-- Email -->\r\n");
      out.write("\r\n");
      out.write("            <label id=\"texto\">Email <span class=\"alerta\">*</span></label><br> \r\n");
      out.write("            <input type=\"email\" class=\"form-control col-md-10  border border-dark\" id=\"email\" maxlength=\"45\" name=\"email\" value=\"\" required=\"required\">\r\n");
      out.write("\r\n");
      out.write("            <br> <br> \r\n");
      out.write("            <!-- Assunto -->\r\n");
      out.write("\r\n");
      out.write("            <label id=\"texto\">Assunto <span class=\"alerta\">*</span></label><br> \r\n");
      out.write("            <select id=\"assunto\" class=\"form-control col-md-10  border border-dark\" name=\"assunto\" required=\"required\"><br> \r\n");
      out.write("                <option selected>Dúvidas</option>\r\n");
      out.write("                <option>Reclamações</option>\r\n");
      out.write("                <option>Cancelamento</option>\r\n");
      out.write("                <option>Outros Assuntos</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <br> <br> \r\n");
      out.write("\r\n");
      out.write("            <!-- Mensagem -->\r\n");
      out.write("\r\n");
      out.write("            <label id=\"texto\">Mensagem <span class=\"alerta\">*</span></label><br> \r\n");
      out.write("            <textarea class=\"form-control col-md-8  border border-dark\" id=\"mensagem\" rows=\"7\" maxlength=\"2000\" name=\"mensagem\" required=\"required\"></textarea><br> \r\n");
      out.write("            * Campos obrigatórios\r\n");
      out.write("            <br> <br> \r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\" id=\"botao2\">Enviar</button>\r\n");
      out.write("        </form>    \r\n");
      out.write("\r\n");
      out.write("        <!-- Mensagem de resposta -->\r\n");
      out.write("        ");
      out.print(request.getParameter("msg"));
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Conteúdo fim -->\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
