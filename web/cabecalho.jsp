<%@page import="DAO.ClienteDAO"%>
<%@page import="Classes.Cliente"%>
<!DOCTYPE html>
<html lang="">
    <head>
        <meta charset="utf-8">
        <noscript><meta http-equiv="refresh" content="1" ></noscript>
        <!--<link rel="icon" href="corpo/logo3.png" type="image/png" sizes="16x16">-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script
            src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>
        <script
            src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"
            integrity="sha256-VazP97ZCwtekAsvgPBSUwPFKdrwD3unUfSGVYrahUqU="
            crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="res/css/index.css">
        <link rel="stylesheet" type="text/css" href="res/css/pagina_produto.css">
        <link rel="stylesheet" type="text/css" href="res/css/produto.css">
        <link rel="stylesheet" type="text/css" href="res/css/pesquisa.css">
        <link type="text/css" rel="stylesheet" href="res/css/style.css" media="screen" />
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    </head>
    <title>KICC</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand" href="index.jsp">
            <img src="res/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
            KICC
        </a>
        <div class="col-sm-3"></div>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">

            <!-- PESQUISA -->
            <form method="GET" action="PesquisaServlet" class="form-inline my-2 my-lg-0" >
                <input class="form-control mr-sm-2" size="50" type="search" placeholder="Pesquisar" aria-label="Search" name="pesquisa" id="txtPesquisa">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
            </form>
            
            
            <div class="col-sm-3"></div>


            <ul class="navbar-nav mr-auto" >
                <%
                    response.setContentType("text/html;charset=UTF-8");

                    if (session.getAttribute("email") != null) {

                        String email = request.getSession().getAttribute("email").toString();

                        Cliente user = new ClienteDAO().getUsuario(email);

                        out.print("<li class='nav-item active'>");
                        out.print("<a class='nav-link' href='minha_conta.jsp'>Minha Conta<span class='sr-only'>(current)</span></a>");
                        out.print("</li>");
                        out.print("<li class='nav-item'>");
                        out.print("<a class='nav-link' href='carrinho_compra.jsp'>Carrinho<span class='sr-only'>(current)</span></a>");
                        out.print("</li>");
                        out.print("<li class='nav-item'>");
                        out.print("<a class=nav-link href='./SairServlet'>Sair</a>");
                        out.print("</li>");

                    } else {
                        out.print("<li class='nav-item'>");
                        out.print("<a class='nav-link' href='carrinho_compra.jsp'>Carrinho<span class='sr-only'>(current)</span></a>");
                        out.print("</li>");
                        out.print("<li class='nav-item'>");
                        out.print("<a class=nav-link href=login.jsp>Login</a>");
                        out.print("</li>");
                    }
                %>   

            </ul>
        </div>
    </nav>