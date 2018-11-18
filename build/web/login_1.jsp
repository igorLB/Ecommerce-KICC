<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="text/javascript">

        var REST_URL = "http://localhost:11233/ProjetoKiccWebService/webresources/clientes";
        $(document).ready(function() {
            $("#pesquisar").click(function() {
            $.ajax({
            type: "GET",
                    url: REST_URL + "/" + $("#email").val() + "/" + $("#senha").val(),
                    success: function(results) {
                        console.log(results);
                    if(results === "ok"){
                        alert('ok');
                    } else {
                        alert('erro' + results);
                    }
        
        //$("#resposta").html(data);
                    }
            });
                    return (false);
            });
            
            
                    $("#excluir").click(function() {
            $.ajax({
            type: "DELETE",
                    url: REST_URL + "/" + $("#id").val(),
                    success: function(data) {
                    var resposta = $(data).find("resposta");
                            $("#resposta").html(resposta);
                    }
            });
                    return (false);
            });
            $("#listar").click(function() {
                $.ajax({
                type: "GET",
                    url: REST_URL,
                    success: function(data) {
                    var resposta = "<table border='1'>";
                            for (i in data) {
                    resposta += "<tr>";
                            resposta += "<td>" + data[i].id + "</td>";
                            resposta += "<td>" + data[i].userName + "</td>";
                            resposta += "<td>" + data[i].address + "</td>";
                            resposta += "<td>" + data[i].email + "</td>";
                            resposta += "<tr>";
                    }
                    resposta += "</table>";
                            $("#resposta").html(resposta);
                    }
                });
                return (false);
            });

        });
        </script>
    </head>
    <body>
        <h1>Usuários</h1>
        <form id="form1" name="form1" method="POST">
            Email: <input type="text" name="email" id="email" /><br/>
            Senha: <input type="text" name="senha" id="senha" /><br/><br/>
            <input type="button" id="pesquisar" value="Pesquisar" />
            <input type="button" id="listar" value="Listar" />
            <input type="button" id="excluir" value="Excluir" />
            <br/>
            <br/>
            <div id="resposta"></div>
        </form>

    </body>
</html>
