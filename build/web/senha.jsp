<%-- 
    Document   : Senha
    Created on : 23/09/2018, 13:02:25
    Author     : Caique
--%>

<%@page import="modelDAO.UsuarioDAO"%>
<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>DropBooks</title>

        <link href="res/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="res/css/modern-business.css" rel="stylesheet">

        <script src="res/jquery-3.3.1.js"></script>
        
        <!-- IMPORTA O MENU SUPERIOR E O FOOTER -->
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script>
           $(function(){
              $("#header").load("MenuNavBar.jsp");
              $("#footer").load("Footer.jsp");
           });
        </script>
        <!-- IMPORTA O MENU SUPERIOR E O FOOTER -->

        <!-- <link href="res/css/the-big-picture.css" rel="stylesheet">
        -->
        <script type="text/javascript">

            $(document).ready(function () {
                $("#validaEmail").hide();
                $("#validaCpf").hide();
                $("#validaOk").hide();
                $('#enviar').click(function () {

                    $("#validaEmail").hide();
                    $("#validaCpf").hide();

                    var email = $("#email").val();
                    var cpf = $("#cpf").val();
                    var senha = $("#senha").val();

                    $.ajax({
                        type: 'POST',
                        url: "RecupSenhaServlet",
                        data: {
                            email: email,
                            cpf: cpf,
                            senha: senha
                        },
                        success: function (results) {
                            if (results === "1") {
                                $("#validaEmail").show();
                            } else if (results === "2") {
                                $("#validaCpf").show();
                            } else {
                                $("#validaOk").show();
                                $("#enviar").hide();
                                //window.location.href = "../recupSenha";
                            }
                        }
                    });
                });
            });
        </script>

        <style>
            
            
            .conteudo{ 
              margin-top: 5%;
                height: 350px;
                width: 450px;
                margin-left: 30%; 
                font: 'arial';
            }

            input{
                margin:  20px;
                font-weight: 800; 
            }

            #enviar{
                margin-top: 2%;
                margin-left: 35%
            }


        </style>
    </head>

    <body>

        <!-- Navigation -->
        <div id="header"></div>
        
        <section>
            <div class="container">
                <div class="conteudo">

                    <center> <h1>Alterar Senha</h1></center>
                    
                    <form>
                        <div class="form-row">
                            <input type="text" class="form-control border border-dark"  placeholder="Email" id="email" maxlength="45" required="">
                            <div id="validaEmail" style="display: none;">Email Incorreto</div>
                            <input type="text" class="form-control border border-dark" placeholder="CPF" id="cpf" maxlength="20" required="">
                            <div id="validaCpf" style="display: none;">CPF Incorreto</div>
                            <input type="Password" class="form-control border border-dark" placeholder="Senha Nova" maxlength="20" id="senha" required="">

                            <button type="button" class="btn btn-primary" id="enviar">Alterar Senha</button>
                            <div id="validaOk" style="display: none;">Senha alterada com sucesso</div>

                        </div>

                    </form>

                </div>

                <div class="row">
                    <div class="col-lg-6">
                        <h1 class="mt-5"></h1>

                    </div>
                </div>

            </div></section>
        <!-- Footer -->
        <div id="footer"></div>
        
        <!-- Bootstrap core JavaScript -->
        
        <script src="res/vendor/jquery/jquery.min.js"></script>
        <script src="res/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    </body>

</html>
