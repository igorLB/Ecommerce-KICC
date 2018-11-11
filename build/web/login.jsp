
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>


        <meta name="viewport" content="width=device-width, initial-scale=1">


    </head>
    <body>

        <p>Identifique-se</p>
        <form method="post" action="LoginServlet">

            <label>Email</label>
            <input type="text" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"  required="required" placeholder="email@dominio.com"/>
            <br>
            <label>Senha</label>
            <input type="password" name="senha" placeholder="*******"><br>
            <a href="senha.jsp">Esqueceu sua senha?</a><br>
            <button type="submit" value="login" id="enviar">Enviar</button>
        </form>

    </body>

</html>
