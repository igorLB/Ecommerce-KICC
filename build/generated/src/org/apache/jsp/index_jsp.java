package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.ProdutoDAO;
import Classes.Produto;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cabecalho.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"col-sm-14 mr-auto ml-auto\" align=\"\" > \r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light\">\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarTogglerDemo01\" aria-controls=\"navbarTogglerDemo01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo01\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"></a>\r\n");
      out.write("                <ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">\r\n");
      out.write("                    <li class=\"nav-item active\">\r\n");
      out.write("                        <button class=\"btnMenu button2\" id=\"btndado\" type=\"button\"><a id=\"btndados\" class=\"nav-link\" href=\"index.jsp\">Home</a></button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <button class=\"btnMenu button2\" type=\"button\"><a id=\"btnvendas\" class=\"nav-link \" href=\"#\">Produto</a></button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <button class=\"btnMenu button2\" type=\"button\"><a id=\"btntrocas\" class=\"nav-link\" href=\"#\">Produto</a></button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <button class=\"btnMenu button2\" type=\"button\"><a id=\"btncompras\" class=\"nav-link\" href=\"#\">Produtos</a></button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <button class=\"btnMenu button2\" type=\"button\"><a id=\"btncontrole\" class=\"nav-link\" href=\"\">Produto</a></button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <button class=\"btnMenu button2\" id=\"btnlog\" type=\"button\"><a id=\"btnlogout\" class=\"nav-link\" href=\"\">Sobre o KICC</a></button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"carouselExampleIndicators\" class=\"carousel slide carousel-fade\" data-ride=\"carousel\">\r\n");
      out.write("    <ol class=\"carousel-indicators\">\r\n");
      out.write("        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("    </ol>\r\n");
      out.write("    <div class=\"carousel-inner\">\r\n");
      out.write("        <div class=\"carousel-item active\">\r\n");
      out.write("            <img class=\"d-block w-100\" id=\"banner1\" src=\"res/banner/1.jpg\" alt=\"First slide\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img class=\"d-block w-100\" id=\"banner2\" src=\"res/banner/2.jpg\" alt=\"Second slide\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img class=\"d-block w-100\" id=\"banner3\" src=\"res/banner/3.png\" alt=\"Third slide\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("        <span class=\"sr-only\">Previous</span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("        <span class=\"sr-only\">Next</span>\r\n");
      out.write("    </a>\r\n");
      out.write("</div>\r\n");
      out.write("<main role=\"main\">\r\n");
      out.write("    <section class=\"jumbotron text-center\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1 class=\"jumbotron-heading\">KICC</h1>\r\n");
      out.write("            <p class=\"lead text-muted\">Departamento de Alimentos e Bebidas com as melhores Ofertas e Promoções nas loja KICC.com. Compra segura, preço baixo e entrega rápida!</p>\r\n");
      out.write("            <hr>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            <!-- Produtos -->\r\n");
      out.write("            ");

          //ArrayList<Produto> listaPop = ProdutoDAO.getProdutosPopulares();

      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"album py-5 bg-light\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center\">\r\n");
      out.write("                        <h1 class=\"display-4 text-dark\">Anúncios em Destaque</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"card mb-4 shadow-sm\">\r\n");
      out.write("                                <div class=\"zoom\">\r\n");
      out.write("                                    <img class=\"card-img-top\" src=\"res/images/sem-foto.webp\" alt=\"Card image cap\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <p class=\"card-text\">Produto</p>\r\n");
      out.write("                                    <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                        <div class=\"btn-group\">\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Compra</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <small class=\"text-muted\">R$ 30,00</small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"card mb-4 shadow-sm\">\r\n");
      out.write("                                <div class=\"zoom\">\r\n");
      out.write("                                    <img class=\"card-img-top\" src=\"res/images/sem-foto.webp\" alt=\"Card image cap\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <p class=\"card-text\">Produto</p>\r\n");
      out.write("                                    <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                        <div class=\"btn-group\">\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Compra</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <small class=\"text-muted\">R$ 5,00</small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"card mb-4 shadow-sm\">\r\n");
      out.write("                                <div class=\"zoom\">\r\n");
      out.write("                                    <img class=\"card-img-top\" src=\"res/images/sem-foto.webp\" alt=\"Card image cap\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <p class=\"card-text\">Produto</p>\r\n");
      out.write("                                    <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                        <div class=\"btn-group\">\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Compra</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <small class=\"text-muted\">R$ 50,00</small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"card mb-4 shadow-sm\">\r\n");
      out.write("                                <div class=\"zoom\">\r\n");
      out.write("                                    <img class=\"rounded img-fluid\" id=\"imagemprodutos\" src=\"res/images/sem-foto.webp\" alt=\"Card image cap\"></center>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <p class=\"card-text\">Produto</p>\r\n");
      out.write("                                    <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                        <div class=\"btn-group\">\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Compra</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <small class=\"text-muted\">R$ 30,00</small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"card mb-4 shadow-sm\">\r\n");
      out.write("                                <div class=\"zoom\">\r\n");
      out.write("                                    <img class=\"rounded img-fluid\" id=\"imagemprodutos\" src=\"res/images/sem-foto.webp\" alt=\"Card image cap\"></center>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <p class=\"card-text\">Produto</p>\r\n");
      out.write("                                    <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                        <div class=\"btn-group\">\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Compra</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <small class=\"text-muted\">R$ 30,00</small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"card mb-4 shadow-sm\">\r\n");
      out.write("                                <div class=\"zoom\">\r\n");
      out.write("                                    <img class=\"rounded img-fluid\" id=\"imagemprodutos\" src=\"res/images/sem-foto.webp\" alt=\"Card image cap\"></center>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <p class=\"card-text\">Produto</p>\r\n");
      out.write("                                    <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                        <div class=\"btn-group\">\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Compra</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <small class=\"text-muted\">R$ 30,00</small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </main>\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "rodape.jsp", out, false);
      out.write("\r\n");
      out.write("            </body>\r\n");
      out.write("            </html>");
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
