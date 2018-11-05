/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Produto;
import modelDAO.ProdutoDAO;

/**
 *
 * @author vinim
 */
public class PesquisarLivrosServlet extends HttpServlet {

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
        
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {

            
            
            String palavraChave  = request.getParameter("palavraChave");
            ArrayList<Produto> produtos = new ArrayList();
            HttpSession session = request.getSession();
            
            
            if(null != request.getParameter("opcaoPesquisa")) {
            
                switch (request.getParameter("opcaoPesquisa")) {
                    case "Titulo":
                        
                        
                        produtos = ProdutoDAO.getProdutosPorTermo("%"+palavraChave);
                        session.setAttribute("produtos", produtos);
                        session.setAttribute("opcao","Titulo");
                        session.setAttribute("palavraChave",palavraChave);
                        break;
                    case "Autor":
                        produtos = ProdutoDAO.getProdutosPorAutor("%"+palavraChave);
                        session.setAttribute("produtos", produtos);
                        session.setAttribute("opcao","Autor");
                        session.setAttribute("palavraChave",palavraChave);
                        break;
                    case "Editora":
                        produtos = ProdutoDAO.getProdutosPorEditora("%"+palavraChave);
                        session.setAttribute("produtos", produtos);
                        session.setAttribute("opcao","Editora");
                        session.setAttribute("palavraChave",palavraChave);
                        break;
                    case "Genero":
                        produtos = ProdutoDAO.getProdutosPorGenero("%"+palavraChave);
                        session.setAttribute("produtos", produtos);
                        session.setAttribute("opcao","Genero");
                        session.setAttribute("palavraChave",palavraChave);
                        break;
                    default:
                        break;
                }
            }
            
            
           
            
            
                 response.sendRedirect("pesquisa.jsp");
            
        }
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
