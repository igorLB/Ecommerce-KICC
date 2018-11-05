
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>


        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="res/fonts/font-awesome-4.7.0/css/font-awesome.min.css"/>
        <link rel="stylesheet" type="text/css" href="res/css/util.css"/>
        <link rel="stylesheet" type="text/css" href="res/css/main.css"/>


        <link href="res/css/bootstrap.min.css" rel="stylesheet">
        <link href="res/css/style.css" rel="stylesheet">
        <script src="res/js/jquery.js"></script>
        <script src="res/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="res/jquery-3.3.1.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#enviar').click(function () {

                    alert("");
                    var email = $("#email").val();
                    var senha = $("#senha").val();
                    $.ajax({
                        type: 'POST',
                        url: "ServletLogin",
                        data: {
                            email: email,
                            senha: senha
                        },
                        success: function (results) {
                            if (results === "1") {
                                $("#email").css("color", "red");
                            } else if (results === "2") {
                                $("#senha").css("color", "red");
                            }
                            els e{
                                $("#email").css("color", "green");
                                $("#senha").css("color", "green");
                            }
                        }
                    });
                });
            });
        </script>

        <style>

            #caixa2{
                margin-top: 7%;
                margin-left: 20%;
                margin-bottom: 3%;
                clear: both;

            }

            #container{
                margin-top: 3%;
                margin-bottom: 10%;
                margin-left: 15%;
            }

            #nav{
                background: #090446;
            }

            .navbar .navbar-nav li a{
                color: #FEB95F !important;
                font-weight: 400;



            }
            .navbar .navbar-nav li a:hover{
                color: #FEB95F !important;
                font-weight: 400;

                transform: scale(1);


            }
            .navbar-brand{
                color: #FEB95F !important;
                font-size: 24px;
                font-weight: 700;

            }

            #footer{
                background: #090446;

            }
            #corAmarelo{
                color:#FEB95F ;
            }

            #corBranca{
                color: white;
            }

            #botao1, #enviar{
                background: #090446;
                color: #FEB95F !important;
            }

            #cadastrar{
                color: #090446;
                background:#FEB95F;
            }
        </style>
    </head>
    <body>
        <!-- Navigation -->
        <nav class="navbar fixed-top navbar-expand-lg navbar-dark  fixed-top" id="nav">
            <div class="container">
                <a class="navbar-brand" href="index.jsp">DropBooks</a>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="index.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="pesquisa.jsp">Livros</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Contato.jsp">Contato</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

      <form id="caixa2" method='post' action="PesquisarLivrosServlet">
            <div class="form-row align-items-center">
                <div class="col-auto my-1">
                    <select class="custom-select mr-sm-2 border border-dark" id="tipoPesquisa" name="opcaoPesquisa">
                        <option  value="Titulo">Título</option>
                        <option  value="Autor">Autor</option>
                        <option  value="Editora">Editora</option>
                        <option  value="Genero">Genêro</option>
                    </select>
                </div>
                <div class="col-auto col-md-6">
                    <input class="form-control mr-sm-2 border border-dark" type="search" placeholder="Pesquisar" aria-label="Pesquisar" name="palavraChave">
                </div>
                <button type="submit" class="btn border-0" id="botao1" name="botao1">Pesquisa</button>
            </div>
        </form>


        <div class="container col-lg-6" >
            <div class="row">
                <div class="formLogin col-md-8" id="container">
                    <p class="h3 text-center">Identifique-se</p>
                    <form action="Login" method="post">
                        <div class="form-group">
                            <label for="labelLogin">Email</label>
                            <input type="text" class="form-control  border border-dark"  name="email" aria-describedby="email"
                                   pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"  required="required"
                                   placeholder="email@dominio.com"/>
                        </div>
                        <div class="form-group">
                            <label for="labelSenha">Senha</label>
                            <input type="password" class="form-control  border border-dark"  name="senha" aria-describedby="senha" placeholder="*******">
                            <small class="text-left novaSenha "><a href="Senha.html">Esqueceu sua senha?</a></small>
                        </div>
                        <button type="submit" value="login" class="btn border-0 btn-block" id="enviar">Enviar</button>
                    </form><hr>

                    <!--Adicionar link chamando um novo registro-->
                    <div class="goRegistro">
                        <label for="labelNovoReg">Primeira vez no Dropbooks?</label><br>
                        <a href="cadastro.html">
                            <button type="submit" class="btn btn-block" id="cadastrar">
                                Cadastre-se</button></a>
                    </div>
                </div><br>
            </div>
        </div>

        <!-- Footer -->

        <!-- Footer -->
        <footer class="bg6 p-t-45 p-b-43 p-l-45 p-r-45" id="footer">
            <div class="flex-w p-b-90">
                <div class="w-size6 p-t-30 p-l-15 p-r-15 respon3">
                    <h4	 id="corAmarelo">
                        Problemas
                    </h4>
                    <div>
                        <p class="s-text7 w-size27" id="corBranca">
                            Caso Tenha Qualquer Problema na Compra ou Venda do Seu livro Entre em Contato Para que seja Resolvido.
                            Agradecemos sua Visita. Volte Sempre !
                        </p>
                    </div>
                </div>
                <div class="w-size7 p-t-30 p-l-15 p-r-15 respon4">
                    <h4  class="s-text12 p-b-30" id="corAmarelo">
                        Categorias
                    </h4>
                    <ul>
                        <li class="p-b-9">
                            <a href="#" id="corBranca">
                                Ficção
                            </a>
                        </li>
                        <li class="p-b-9">
                            <a href="#" id="corBranca">
                                Terror
                            </a>
                        </li>
                        <li class="p-b-9">
                            <a href="#" id="corBranca">
                                Romance
                            </a>
                        </li>
                        <li class="p-b-9">
                            <a href="#" id="corBranca">
                                Academicos
                            </a>
                        </li>
                    </ul>
                </div>
                <div class="w-size7 p-t-30 p-l-15 p-r-15 respon4">
                    <h4 class="s-text12 p-b-30"  id="corAmarelo">Livros</h4>
                    <ul>
                        <li class="p-b-9"><a href="#" id="corBranca">Busca</a></li>
                        <li class="p-b-9"><a href="#" id="corBranca">Sobre Nós</a></li>
                        <li class="p-b-9"><a href="#" id="corBranca">Email</a></li>
                        <li class="p-b-9"><a href="#" id="corBranca">Local</a></li>
                    </ul>
                </div>
                <div class="w-size7 p-t-30 p-l-15 p-r-15 respon4">
                    <h4 class="s-text12 p-b-30"  id="corAmarelo">Ajuda</h4>
                    <ul>
                        <li class="p-b-9">
                            <a href="#" class="s-text7" id="corBranca">Dicas</a>
                        </li>
                        <li class="p-b-9">
                            <a href="#" class="s-text7" id="corBranca">Como Vender</a>
                        </li>
                        <li class="p-b-9">
                            <a href="#" class="s-text7" id="corBranca">Como Comprar</a>
                        </li>
                        <li class="p-b-9">
                            <a href="#" class="s-text7" id="corBranca">FAQs</a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="t-center p-l-15 p-r-15">
                <a href="#"><img class="h-size2" src="res/images/icons/paypal.png" alt="IMG-PAYPAL"></a>
                <a href="#"><img class="h-size2" src="res/images/icons/visa.png" alt="IMG-VISA"></a>
                <a href="#"><img class="h-size2" src="res/images/icons/mastercard.png" alt="IMG-MASTERCARD"></a>
                <a href="#"><img class="h-size2" src="res/images/icons/express.png" alt="IMG-EXPRESS"></a>
                <a href="#"><img class="h-size2" src="res/images/icons/discover.png" alt="IMG-DISCOVER"></a>
                <div class="t-center s-text8 p-t-20">
                    Copyright © 2018 Todos Direitos Reservados <i class="fa fa-heart-o" aria-hidden="true"></i> by DropBooks
                </div>
            </div>
        </footer>

        <!-- Back to top -->
        <div class="btn-back-to-top bg0-hov" id="myBtn">
            <span class="symbol-btn-back-to-top">
                <i class="fa fa-angle-double-up" aria-hidden="true"></i>
            </span>
        </div>

        <!-- Container Selection1 -->
        <div id="dropDownSelect1"></div>

    </body>

</html>
