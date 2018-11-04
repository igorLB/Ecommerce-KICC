/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ItemCart;
import modelDAO.ProdutoDAO;

/**
 *
 * @author marketing0
 */
@WebServlet(name = "GetShoppingCartServlet", urlPatterns = {"/GetShoppingCartServlet"})
public class GetShoppingCartServlet extends HttpServlet {

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
            HashMap<Integer, Integer> lista =  new HashMap<>();
            Cookie[] cookies = request.getCookies();

            ArrayList<ItemCart> cart = new ArrayList<>();

            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if ("ShoppingCart".equals(cookie.getName())) {
                        String value = cookie.getValue();
                        value = value.substring(1, value.length()-1);
                        String[] keyValuePairs = value.split(",");

                        if (value.length() > 0){
                            for(String pair : keyValuePairs) {
                                String[] entry = pair.split("=");
                                lista.put(Integer.parseInt(entry[0].trim()), Integer.parseInt(entry[1].trim()));
                            }
                        }
                    }
                }
            }

            if (lista.size() > 0) {
                for(Map.Entry<Integer, Integer> entry : lista.entrySet()) {
                    if (lista.get(entry.getKey()) != null) {
                        ItemCart item = new ItemCart();
                        int qtd = lista.get(entry.getKey());
                    
                        if (ProdutoDAO.getProduto(entry.getKey()) != null) {
                            item.setProduto(ProdutoDAO.getProduto(entry.getKey()));
                            item.setQuantidade(qtd);
                            cart.add(item);
                        }
                    }
                }
            }
            
            GsonBuilder gBuilder = new GsonBuilder();
            Gson gson = gBuilder.create();
            String jsonCart = gson.toJson(cart);
            
            out.print(jsonCart);
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
