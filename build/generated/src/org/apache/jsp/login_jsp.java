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
      out.write("\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"res/fonts/font-awesome-4.7.0/css/font-awesome.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"res/css/util.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"res/css/main.css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link href=\"res/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"res/css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"res/js/jquery.js\"></script>\n");
      out.write("        <script src=\"res/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"res/jquery-3.3.1.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#enviar').click(function () {\n");
      out.write("\n");
      out.write("                    alert(\"\");\n");
      out.write("                    var email = $(\"#email\").val();\n");
      out.write("                    var senha = $(\"#senha\").val();\n");
      out.write("                    $.ajax({\n");
      out.write("                        type: 'POST',\n");
      out.write("                        url: \"ServletLogin\",\n");
      out.write("                        data: {\n");
      out.write("                            email: email,\n");
      out.write("                            senha: senha\n");
      out.write("                        },\n");
      out.write("                        success: function (results) {\n");
      out.write("                            if (results === \"1\") {\n");
      out.write("                                $(\"#email\").css(\"color\", \"red\");\n");
      out.write("                            } else if (results === \"2\") {\n");
      out.write("                                $(\"#senha\").css(\"color\", \"red\");\n");
      out.write("                            }\n");
      out.write("                            els e{\n");
      out.write("                                $(\"#email\").css(\"color\", \"green\");\n");
      out.write("                                $(\"#senha\").css(\"color\", \"green\");\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            #caixa2{\n");
      out.write("                margin-top: 7%;\n");
      out.write("                margin-left: 20%;\n");
      out.write("                margin-bottom: 3%;\n");
      out.write("                clear: both;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #container{\n");
      out.write("                margin-top: 3%;\n");
      out.write("                margin-bottom: 10%;\n");
      out.write("                margin-left: 15%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #nav{\n");
      out.write("                background: #090446;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar .navbar-nav li a{\n");
      out.write("                color: #FEB95F !important;\n");
      out.write("                font-weight: 400;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .navbar .navbar-nav li a:hover{\n");
      out.write("                color: #FEB95F !important;\n");
      out.write("                font-weight: 400;\n");
      out.write("\n");
      out.write("                transform: scale(1);\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .navbar-brand{\n");
      out.write("                color: #FEB95F !important;\n");
      out.write("                font-size: 24px;\n");
      out.write("                font-weight: 700;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #footer{\n");
      out.write("                background: #090446;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #corAmarelo{\n");
      out.write("                color:#FEB95F ;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #corBranca{\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #botao1, #enviar{\n");
      out.write("                background: #090446;\n");
      out.write("                color: #FEB95F !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #cadastrar{\n");
      out.write("                color: #090446;\n");
      out.write("                background:#FEB95F;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav class=\"navbar fixed-top navbar-expand-lg navbar-dark  fixed-top\" id=\"nav\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">DropBooks</a>\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"index.jsp\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"pesquisa.jsp\">Livros</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Contato.jsp\">Contato</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("      <form id=\"caixa2\" method='post' action=\"PesquisarLivrosServlet\">\n");
      out.write("            <div class=\"form-row align-items-center\">\n");
      out.write("                <div class=\"col-auto my-1\">\n");
      out.write("                    <select class=\"custom-select mr-sm-2 border border-dark\" id=\"tipoPesquisa\" name=\"opcaoPesquisa\">\n");
      out.write("                        <option  value=\"Titulo\">Título</option>\n");
      out.write("                        <option  value=\"Autor\">Autor</option>\n");
      out.write("                        <option  value=\"Editora\">Editora</option>\n");
      out.write("                        <option  value=\"Genero\">Genêro</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-auto col-md-6\">\n");
      out.write("                    <input class=\"form-control mr-sm-2 border border-dark\" type=\"search\" placeholder=\"Pesquisar\" aria-label=\"Pesquisar\" name=\"palavraChave\">\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn border-0\" id=\"botao1\" name=\"botao1\">Pesquisa</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container col-lg-6\" >\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"formLogin col-md-8\" id=\"container\">\n");
      out.write("                    <p class=\"h3 text-center\">Identifique-se</p>\n");
      out.write("                    <form action=\"Login\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"labelLogin\">Email</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control  border border-dark\"  name=\"email\" aria-describedby=\"email\"\n");
      out.write("                                   pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$\"  required=\"required\"\n");
      out.write("                                   placeholder=\"email@dominio.com\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"labelSenha\">Senha</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control  border border-dark\"  name=\"senha\" aria-describedby=\"senha\" placeholder=\"*******\">\n");
      out.write("                            <small class=\"text-left novaSenha \"><a href=\"Senha.html\">Esqueceu sua senha?</a></small>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" value=\"login\" class=\"btn border-0 btn-block\" id=\"enviar\">Enviar</button>\n");
      out.write("                    </form><hr>\n");
      out.write("\n");
      out.write("                    <!--Adicionar link chamando um novo registro-->\n");
      out.write("                    <div class=\"goRegistro\">\n");
      out.write("                        <label for=\"labelNovoReg\">Primeira vez no Dropbooks?</label><br>\n");
      out.write("                        <a href=\"cadastro.html\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-block\" id=\"cadastrar\">\n");
      out.write("                                Cadastre-se</button></a>\n");
      out.write("                    </div>\n");
      out.write("                </div><br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer class=\"bg6 p-t-45 p-b-43 p-l-45 p-r-45\" id=\"footer\">\n");
      out.write("            <div class=\"flex-w p-b-90\">\n");
      out.write("                <div class=\"w-size6 p-t-30 p-l-15 p-r-15 respon3\">\n");
      out.write("                    <h4\t id=\"corAmarelo\">\n");
      out.write("                        Problemas\n");
      out.write("                    </h4>\n");
      out.write("                    <div>\n");
      out.write("                        <p class=\"s-text7 w-size27\" id=\"corBranca\">\n");
      out.write("                            Caso Tenha Qualquer Problema na Compra ou Venda do Seu livro Entre em Contato Para que seja Resolvido.\n");
      out.write("                            Agradecemos sua Visita. Volte Sempre !\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w-size7 p-t-30 p-l-15 p-r-15 respon4\">\n");
      out.write("                    <h4  class=\"s-text12 p-b-30\" id=\"corAmarelo\">\n");
      out.write("                        Categorias\n");
      out.write("                    </h4>\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"p-b-9\">\n");
      out.write("                            <a href=\"#\" id=\"corBranca\">\n");
      out.write("                                Ficção\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"p-b-9\">\n");
      out.write("                            <a href=\"#\" id=\"corBranca\">\n");
      out.write("                                Terror\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"p-b-9\">\n");
      out.write("                            <a href=\"#\" id=\"corBranca\">\n");
      out.write("                                Romance\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"p-b-9\">\n");
      out.write("                            <a href=\"#\" id=\"corBranca\">\n");
      out.write("                                Academicos\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w-size7 p-t-30 p-l-15 p-r-15 respon4\">\n");
      out.write("                    <h4 class=\"s-text12 p-b-30\"  id=\"corAmarelo\">Livros</h4>\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"p-b-9\"><a href=\"#\" id=\"corBranca\">Busca</a></li>\n");
      out.write("                        <li class=\"p-b-9\"><a href=\"#\" id=\"corBranca\">Sobre Nós</a></li>\n");
      out.write("                        <li class=\"p-b-9\"><a href=\"#\" id=\"corBranca\">Email</a></li>\n");
      out.write("                        <li class=\"p-b-9\"><a href=\"#\" id=\"corBranca\">Local</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w-size7 p-t-30 p-l-15 p-r-15 respon4\">\n");
      out.write("                    <h4 class=\"s-text12 p-b-30\"  id=\"corAmarelo\">Ajuda</h4>\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"p-b-9\">\n");
      out.write("                            <a href=\"#\" class=\"s-text7\" id=\"corBranca\">Dicas</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"p-b-9\">\n");
      out.write("                            <a href=\"#\" class=\"s-text7\" id=\"corBranca\">Como Vender</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"p-b-9\">\n");
      out.write("                            <a href=\"#\" class=\"s-text7\" id=\"corBranca\">Como Comprar</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"p-b-9\">\n");
      out.write("                            <a href=\"#\" class=\"s-text7\" id=\"corBranca\">FAQs</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"t-center p-l-15 p-r-15\">\n");
      out.write("                <a href=\"#\"><img class=\"h-size2\" src=\"res/images/icons/paypal.png\" alt=\"IMG-PAYPAL\"></a>\n");
      out.write("                <a href=\"#\"><img class=\"h-size2\" src=\"res/images/icons/visa.png\" alt=\"IMG-VISA\"></a>\n");
      out.write("                <a href=\"#\"><img class=\"h-size2\" src=\"res/images/icons/mastercard.png\" alt=\"IMG-MASTERCARD\"></a>\n");
      out.write("                <a href=\"#\"><img class=\"h-size2\" src=\"res/images/icons/express.png\" alt=\"IMG-EXPRESS\"></a>\n");
      out.write("                <a href=\"#\"><img class=\"h-size2\" src=\"res/images/icons/discover.png\" alt=\"IMG-DISCOVER\"></a>\n");
      out.write("                <div class=\"t-center s-text8 p-t-20\">\n");
      out.write("                    Copyright © 2018 Todos Direitos Reservados <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by DropBooks\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!-- Back to top -->\n");
      out.write("        <div class=\"btn-back-to-top bg0-hov\" id=\"myBtn\">\n");
      out.write("            <span class=\"symbol-btn-back-to-top\">\n");
      out.write("                <i class=\"fa fa-angle-double-up\" aria-hidden=\"true\"></i>\n");
      out.write("            </span>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Container Selection1 -->\n");
      out.write("        <div id=\"dropDownSelect1\"></div>\n");
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