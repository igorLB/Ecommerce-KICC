package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Classes.Mensagem;
import Classes.Cliente;
import DAO.ClienteDAO;
import DAO.Conecta;
import DAO.LoginDAO;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {

            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            Cliente objUsuario = new Cliente();

            objUsuario.setEmail(email);
            objUsuario.setSenha(senha);
            List<Cliente> listausuario = new ArrayList<>();

            //Passando os valores para o getUsuario no loginDAO
            listausuario = LoginDAO.getUsuario(email, senha);
            //se não for vazio é porque logou
            if (!(listausuario.isEmpty())) {
                HttpSession session = request.getSession();
                session.setAttribute("email", email);
                response.sendRedirect("index.jsp");
            } else {
                // response.sendRedirect("login.jsp");
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.include(request, response);
            }

        } catch (Exception e) {

            out.print("esse erro nunca existiu aqui");
        }

    }
}
