package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;
import modelDAO.UsuarioDAO;

@WebServlet(name = "RecupSenhaServlet", urlPatterns = {"/RecupSenhaServlet"})
public class RecupSenhaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /*Servlet recebe parâmetros enviados pela página*/
        
        String email = request.getParameter("email");
        String cpf = request.getParameter("cpf");
        String senha = request.getParameter("senha");
        Usuario usuario = UsuarioDAO.getUsuario(email);
        
         /*Servlet trata e passa os parâmetros de volta à página*/
        
        response.setContentType("text/html;charset=UTF-8");         
        try (PrintWriter out = response.getWriter()) {
           
            if(usuario == null){
                response.getWriter().write("1");
            }else if(!usuario.getCpf_cnpj().equals(cpf)){
                response.getWriter().write("2");
            }else{
                usuario.setSenha(senha);
                new UsuarioDAO().setSenha(usuario);
                response.getWriter().write("3");
            }
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
