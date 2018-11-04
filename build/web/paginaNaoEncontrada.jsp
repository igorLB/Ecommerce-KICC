<%@page import="modelDAO.UsuarioDAO"%>
<%@page import="model.Usuario"%>
<%@page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <!-- Meta tags Obrigatï¿½rias -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <script src="res/jquery-3.3.1.js"></script>
        <link href="res/css/bootstrap.min.css" rel="stylesheet">
        <link href="res/css/modern-business.css" rel="stylesheet">
        <script src="res/js/contato.js"></script>


        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="res/fonts/font-awesome-4.7.0/css/font-awesome.min.css"/>
        <link rel="stylesheet" type="text/css" href="res/css/util.css"/>
        <link rel="stylesheet" type="text/css" href="res/css/main.css"/>


        <style>
            #container{
                margin-top: 2%;
                width: 50%;
                margin-left: 30%;
                margin-bottom: 7%;
            }
            #caixa2{
                margin-top: 7%;
                margin-left: 25%;
                margin-bottom: 3%;
                clear: both;
            }
            .titulo{
                color: black;
                padding: 3%;
                margin-left: 20%;
            }
            #botao2{
                margin-top: 3%;
                margin-left: 5%;
                margin-bottom: 3%;
                width: 60%;
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
            #botao1, #botao2{
                color: #FEB95F !important;
                background: #090446;
            }#link{
	 color:  #090446 !important;
            }
            
        </style>

          <link href="res/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
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
                            <a class="nav-link" href="Contato.jsp">Contato</a>
                        </li>
                        <li class="nav-item">
                            <%
                                //VARIAVEIS QUE Vï¿½O PREENCHER OS CAMPOS VAZIOS COM OS DADOS DO USUARIO(SE ESTIVER LOGADO)
                                String _email = "";
                                String _nome = "";
                                //IDENTIFICA SE O USUARIO ESTA LOGADO E TRAZ SEUS DADOS PARA A PAGINA, SE NAO ESTIVER LOGADO, MOSTRA O LINK PARA QUE O IMUNDO POSSA SE LOGAR
                                if(session.getAttribute("email") != null) {

                                    String email = request.getSession().getAttribute("email").toString();

                                    Usuario user = new UsuarioDAO().getUsuario(email);
                                    _email += user.getEmail();
                                    _nome +=user.getNomeRazao();
                             
                                    out.print("</li>");
                                    out.print("<li class=nav-item>");
                                    out.print("<li class='nav-item dropdown'> "
                                            + "<a class='nav-link dropdown-toggle' href='#' id='navbarDropdownPortfolio' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>"+ user.getNomeRazao() +"</a>"
                                            +"<div class='dropdown-menu dropdown-menu-right' aria-labelledby='navbarDropdownPortfolio'>");
                                                if (user.getNivel_usuario().equals("1")) {
                                                                    out.print("<a class='dropdown-item' href='alterarFuncionarioAdm.jsp' >Cadastrar Funcionários</a>");
                                                                    out.print("<a class='dropdown-item' href='alterarUsuarioAdm.jsp' > Alterar Usuario Adm </a>");
                                                                    out.print("<a class='dropdown-item' href='cadastroFuncionario.jsp' >Cadastrar Funcionários</a>");
                                                                    out.print("<a class='dropdown-item' href='listaUsuarioFuncionario.jsp' >Lista de Funcionários</a>");
                                                                    out.print("<a class='dropdown-item' href='listaUsuarioUsuario.jsp' > Lista de Clientes</a>");
                                                                }
                                    out.print("<a class='dropdown-item' href='carrinho.jsp' >Carrinho</a>"
                                            + "<a class='dropdown-item' href='alterarCadastro.jsp'>Alterar Dados</a>"
                                            + "<a class='dropdown-item' href='catalogoLivro.jsp' >Meu Catalogo</a>"
                                            + "<a class='dropdown-item' href='cadastroProduto.jsp' >Cadastra Catalogo</a>"
                                            + "<a class='dropdown-item' href=Senha.jsp>Alterar Senha</a>"   
                                            + "<a class='dropdown-item' name=Sair href=SairServlet>Sair</a>"
                                            + "</div>"
                                            + "</li>");
                                    
                                } else {
                                    out.print("<a class=nav-link href=login.jsp>Login/Cadastrar</a>");
                                }   
                            %>
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

        <div  class="container" id="container">

                          <h3 class="titulo">Pagina não encontrada</h3>
               
        </div>

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
                    Copyright ï¿½ 2018 Todos Direitos Reservados <i class="fa fa-heart-o" aria-hidden="true"></i> by DropBooks
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


        <!-- Bootstrap core JavaScript -->
        <script src="res/vendor/jquery/jquery.min.js"></script>
        <script src="res/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    </body>
</html>