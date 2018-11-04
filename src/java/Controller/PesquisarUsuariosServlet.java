/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.Mensagem;
import model.Usuario;
import modelDAO.UsuarioDAO;

/**
 *
 * @author Cristiano
 */
@WebServlet(name = "PesquisarUsuariosServlet", urlPatterns = {"/PesquisarUsuariosServlet"})
public class PesquisarUsuariosServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

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
        response.setContentType("text/html;charset=UTF-8");

            String acao = request.getParameter("acao");
            UsuarioDAO dao = new UsuarioDAO();
            ArrayList<Usuario> lista = null;

            if (acao != null) {

                //if (acao.equals("google")) {
                String pesquisa = request.getParameter("pesquisa");
                lista = dao.pesquisarUsuario(pesquisa);
                //}
                /*if (acao.equals("avancado")) {
                String login = request.getParameter("login");
                lista = dao.pesquisarUsuario(login);
            }*/

                request.setAttribute("lista", lista);
                getServletContext().getRequestDispatcher("/listaUsuarioFuncionario.jsp").forward(request, response);

            } else {
                PrintWriter out = response.getWriter();
                out.print("<script>alert('Ação inválida!');history.back();</script>");
            }

    }

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
