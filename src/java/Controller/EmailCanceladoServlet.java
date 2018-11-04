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
@WebServlet(name = "EmailCanceladoServlet", urlPatterns = {"/EmailCanceladoServlet"})
public class EmailCanceladoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String usuario = request.getSession().getAttribute("email").toString();
        Usuario user = new UsuarioDAO().getUsuario("usuario");
            
        String nome = user.getNomeRazao();
        String email = user.getEmail();
        String assunto = "Pedido Cancelado";
        String mensagem = "Olá "+nome+", seu pedido foi cancelado. Verifique o seu pagamento, ou disponibilidade do produto !";

        //Chama o método que envia email
        String resp = model.Email.enviaEmail(nome, email, assunto, mensagem);

        //if(Mensagem.OK.equals(resp)){
            // Exibe a mensagem na tela, abaixo do botão
        //        response.sendRedirect("TROCAR_PAGINA.jsp?msg=" + Mensagem.EMAIL_APROVADO);
        //    }
        //    else{
        //        response.sendRedirect("TROCAR_PAGINA.jsp?msg=" + Mensagem.ERRO_CONEXAO);
        //}
    }

}