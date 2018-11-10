package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Classes.Mensagem;
import Classes.Cliente;
import DAO.ClienteDAO;

/**
 *
 * @author Cristiano
 */
@WebServlet(name = "EmailEnviadoServlet", urlPatterns = {"/EmailEnviadoServlet"})
public class EmailEnviadoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
        String usuario = request.getSession().getAttribute("email").toString();
        Cliente user = new ClienteDAO().getUsuario("usuario");
            
        String nome = user.getNomeRazao();
        String email = user.getEmail();
        String assunto = "Pedido Enviado";
        String mensagem = "Olá "+nome+", seu pedido já foi enviado. Aguarde sem chorar...";

        //Chama o método que envia email
        String resp = Classes.Email.enviaEmail(nome, email, assunto, mensagem);

        //if(Mensagem.OK.equals(resp)){
            // Exibe a mensagem na tela, abaixo do botão
        //        response.sendRedirect("TROCAR_PAGINA.jsp?msg=" + Mensagem.EMAIL_APROVADO);
        //    }
        //    else{
        //        response.sendRedirect("TROCAR_PAGINA.jsp?msg=" + Mensagem.ERRO_CONEXAO);
        //}
                */
    }

}