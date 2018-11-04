package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Banner;
import model.Mensagem;
import modelDAO.BannerDAO;

/**
 *
 * @author Cristiano
 */
@WebServlet(name = "CadastroBannerServlet", urlPatterns = {"/CadastroBannerServlet"})
@MultipartConfig(maxFileSize = 16177215)
public class CadastroBannerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Banner banner = new Banner();
            
            //String email = request.getSession().getAttribute("email").toString();
            //Usuario user = new UsuarioDAO().getUsuario(email);
            
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, 0);
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String hoje = format1.format(cal.getTime());
            
            //banner.setPosicao(Integer.parseInt(request.getParameter("posicao")));
            //banner.setTitulo(request.getParameter("titulo"));
            //banner.setDescricao(request.getParameter("descricao"));
            banner.setData_cadastro(banner.toSqlDate(hoje));
            //banner.setData_validade(banner.toSqlDate(request.getParameter("data_validade")));
            banner.setAtivo(1);
            //banner.setUrl(request.getParameter("url"));
            if(request.getPart("imagem").getSize() != 0){
                banner.setImagem(request.getPart("imagem").getInputStream());
            }
            
            String resp = BannerDAO.setBanner(banner);
            
                    if(Mensagem.OK.equals(resp)){
            // Exibe a mensagem na tela, abaixo do botão
                response.sendRedirect("alterarCarrossel.jsp?msg=" + Mensagem.BANNER_ENVIADO);
            }
            else{
                response.sendRedirect("alterarCarrossel.jsp?msg=" + Mensagem.ERRO_CONEXAO);
            }
            //response.sendRedirect("alterarCarrossel.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
