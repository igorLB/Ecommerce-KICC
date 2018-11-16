
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script type="text/javascript">
            var REST_URL = "http://localhost:11233/ProjetoKiccWebService/webresources/clientes";

            $(document).ready(function() {

                $("#entrar").click(function() {
                    $.ajax({
                    type: "GET",
                        url: REST_URL + "/" + $("#email").val(),
                        success: function(data) {
                        $("#resposta").html(data);
                        }
                    });
                });
                return (false); 
            });
        </script>

    </head>
    <body>

        <p>Identifique-se</p>
        <form method="POST" id="login" name="login">

            <label>Email</label>
            <input type="text" id="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"  required="required" placeholder="email@dominio.com"/>
            <br>
            <label>Senha</label>
            <input type="password" id="senha" name="senha" placeholder="*******"><br>
            <a href="senha.jsp">Esqueceu sua senha?</a><br>
            <button type="submit" name="entrar" id="entrar">Entrar</button>
        </form>
<div id="resposta"></div>
    </body>

</html>
