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
import model.Usuario;
import modelDAO.UsuarioDAO;

/**
 *
 * @author Cristiano
 */
@WebServlet(name = "AlterarUsuarioAdminServlet", urlPatterns = {"/AlterarUsuarioAdminServlet"})
public class AlterarUsuarioAdminServlet extends HttpServlet {

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
         
         int id = Integer.parseInt(request.getParameter("id"));
         
         Usuario user = new UsuarioDAO().getUsuarioAdmin(id);

         user.setId(Integer.parseInt(request.getParameter("id"))); 
         user.setCpf_cnpj(request.getParameter("cpf_cnpj")); 
         //user.setTipoPessoa(Integer.parseInt(request.getParameter("tipoPessoa")));
         user.setDataNascimento(Usuario.toSqlDate(request.getParameter("dataNascimento")));
         user.setSexo(request.getParameter("sexo"));
         user.setEmail(request.getParameter("email")); 
         user.setTelefone(request.getParameter("telefone"));
         user.setNomeRazao(request.getParameter("nomeRazao"));
         user.setCep(request.getParameter("cep")); 
         user.setLogradouro(request.getParameter("logradouro")); 
         user.setNumero(request.getParameter("numero")); 
         user.setComplemento(request.getParameter("complemento")); 
         user.setEstado(request.getParameter("estado")); 
         user.setCidade(request.getParameter("cidade")); 
         user.setBairro(request.getParameter("bairro")); 
         user.setSenha(request.getParameter("senha")); 
         user.setNivel_usuario(request.getParameter("Nivel_Usuario")); 
         user.setAtivo(request.getParameter("Ativo")); 
         user.setBanco(request.getParameter("banco")); 
         user.setConta(Integer.parseInt(request.getParameter("conta"))); 
         user.setAgencia(Integer.parseInt(request.getParameter("agencia"))); 
         user.setDigito(Integer.parseInt(request.getParameter("digito"))); 

         UsuarioDAO.alterarUsuarioAdmin(user);
         
        // Recarregar a página
        response.sendRedirect("alterarFuncionarioAdm.jsp?id=" + id);
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
