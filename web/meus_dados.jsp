
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
            $(document).ready(function () {
                //$("#listar").click(function() {
                $.ajax({
                    type: "GET",
                    url: REST_URL,
                    success: function (data) {
                        var resposta = "<table border='0'>";
                        for (i in data) {
                            resposta += "<tr>";
                            resposta += "<td>Nome: " + data[i].nome + "</td>";
                            resposta += "<td>email" + data[i].email + "</td>";
                            resposta += "<td>CPF: " + data[i].cpf + "</td>";
                            resposta += "<td>Telefone: " + data[i].telefone + "</td>";
                            resposta += "<tr>";
                        }
                        resposta += "</table>";
                        $("#resposta").html(resposta);
                    }
                });
                return (false);
                //});
            });
        </script>

    </head>
    <body>
        <label>Email</label><div id="resposta"></div>
        <br>

    </body>

</html>
