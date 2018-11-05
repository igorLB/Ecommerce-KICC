/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;
import modelDAO.ProdutoDAO;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author Ricardo
 */
@WebServlet(name = "ImagemServlet", urlPatterns = {"/imagens"})
public class ImagemServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
        ProdutoDAO p = new ProdutoDAO();
        Produto prod = p.getProduto(Integer.parseInt(request.getParameter("id_prod")));

        switch(request.getParameter("img")){
            case "1":
                if(prod.getImagem_1() != null){
                    byte[] bytes = IOUtils.toByteArray(prod.getImagem_1());
                    response.setContentLength(bytes.length);
                    response.getOutputStream().write(bytes);
                }else{
                    InputStream is = getServletContext().getResourceAsStream("/WEB-INF/notfound.png");
                    byte[] bytes = IOUtils.toByteArray(is);
                    response.setContentLength(bytes.length);
                    response.getOutputStream().write(bytes);
                }
                break;
            case "2":
                if(prod.getImagem_2() != null){
                    byte[] bytes = IOUtils.toByteArray(prod.getImagem_2());
                    response.setContentLength(bytes.length);
                    response.getOutputStream().write(bytes);
                }else{
                    InputStream is = getServletContext().getResourceAsStream("/WEB-INF/notfound.png");
                    byte[] bytes = IOUtils.toByteArray(is);
                    response.setContentLength(bytes.length);
                    response.getOutputStream().write(bytes);
                }
                break;
            case "3":
                if(prod.getImagem_3() != null){
                    byte[] bytes = IOUtils.toByteArray(prod.getImagem_3());
                    response.setContentLength(bytes.length);
                    response.getOutputStream().write(bytes);
                }else{
                    InputStream is = getServletContext().getResourceAsStream("/WEB-INF/notfound.png");
                    byte[] bytes = IOUtils.toByteArray(is);
                    response.setContentLength(bytes.length);
                    response.getOutputStream().write(bytes);
                }
                break;
            case "4":
                if(prod.getImagem_4() != null){
                    byte[] bytes = IOUtils.toByteArray(prod.getImagem_4());
                    response.setContentLength(bytes.length);
                    response.getOutputStream().write(bytes);
                }else{
                    InputStream is = getServletContext().getResourceAsStream("/WEB-INF/notfound.png");
                    byte[] bytes = IOUtils.toByteArray(is);
                    response.setContentLength(bytes.length);
                    response.getOutputStream().write(bytes);
                }
                break;
            case "5":
                if(prod.getImagem_5() != null){
                    byte[] bytes = IOUtils.toByteArray(prod.getImagem_5());
                    response.setContentLength(bytes.length);
                    response.getOutputStream().write(bytes);
                }else{
                    InputStream is = getServletContext().getResourceAsStream("/WEB-INF/notfound.png");
                    byte[] bytes = IOUtils.toByteArray(is);
                    response.setContentLength(bytes.length);
                    response.getOutputStream().write(bytes);
                }
                break;                    
        }
        
//        response.setContentType("image/jpeg");
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
