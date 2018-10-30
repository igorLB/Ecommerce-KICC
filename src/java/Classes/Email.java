package Classes;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author Cristiano
 */
public class Email {

//Método que envia o email
    public static String enviaEmail(String nome, String email, String assunto, String mensagem) {

        String resp = "";
        Session session = Session.getInstance(getPropriedades(), getAuthenticator());

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("contatokicc@outlook.com")); //Seta o remetente
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(email)); //Define o destinatário
            message.setSubject(assunto); //Define o assunto
            message.setText(mensagem); //Mensagem do email

            Transport.send(message); //Envia o email
            resp = "OK";

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        return resp;
    }

    //Método que retorna a autenticação de sua conta de email
    public static Authenticator getAuthenticator() {

        Authenticator autenticacao = new Authenticator() {

            public PasswordAuthentication getPasswordAuthentication() {

                //Preencha com seu email e com sua senha
                return new PasswordAuthentication("contatokicc@outlook.com", "Mudar123");
            }
        };

        return autenticacao;
    }

    //Método que retorna as propriedades de configuração do servidor de email
    public static Properties getPropriedades() {

        Properties props = new Properties();

        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", "smtp.live.com");
        props.put("mail.smtp.socketFactory.port", "587");
        props.put("mail.smtp.socketFactory.fallback", "false");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");

        return props;
    }
}
