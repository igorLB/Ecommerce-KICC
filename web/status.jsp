<%@page import="model.Item"%>
<%@page import="modelDAO.PedidoDAO"%>
<%@page import="model.Pedido"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="model.Utilitarios"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelDAO.UsuarioDAO"%>
<%@page import="model.Usuario"%>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Status do Pedido</title>
        <script src="res/jquery-3.3.1.js"></script>  
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
        <link rel="stylesheet" href="res/css/bootstrap.css">
        
        <!-- IMPORTA O MENU SUPERIOR E O FOOTER -->
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script>
           $(function(){
              $("#header").load("MenuNavBar.jsp");
              $("#footer").load("Footer.jsp");
           });
        </script>
        <!-- IMPORTA O MENU SUPERIOR E O FOOTER -->
        
        <style>

            .primeiro{display: none;}

            .segundo{display: none;}

            .terceiro{}

            .quarto{display: none;}

            .principal{
                width: 80%;
                margin-left: 10%;
                margin-top: 5%;
                margin-bottom: 5%;
                border: 1px solid #090446;
            }

            h3{
                text-align: center;
                margin-top: 2%;
            }

            .progress{
                margin-top: 3%;
                width: 80%;
                margin-left: 9%;
            }

            .cor{
                color: white;
                font-size: 18px;
            }

            .img{
                width: 10%;
                height: 15%;
                max-width: 10%;
                max-height: 15%;
                margin-top: 5%;
                margin-left: 5%;
                float: left;
            }

            .titulo{margin-top: 7%;	}

            .nome, .quantidade{
                margin-left: 3%;
                font-size: 20px;
            }

            .barra{
                clear: both;
                width: 99.7%;
                margin-left: 5%;
            }

            .info{
                margin-top: 2%;
                margin-left: 7%;
            }

            .direita{float: right;}

            .box{border: 1px solid #090446;}

            p{color: black;}

            .titulo2{font-size: 20px;font-weight: bold;}

            .data{float: right;font-weight: bold;}

            .pedido{font-weight: bold;}

            .titulo3 {
                margin-left: 70%;
                font-size: 16px;
            }

        </style>
        <%
            // Exibir pedido através do usuário logado
            String email = request.getSession().getAttribute("email").toString();
            Usuario user = new UsuarioDAO().getUsuario(email);

            // Data atual
            Date data = new Date();
            DateFormat dataAtual = new SimpleDateFormat("dd/MM/yyyy");
            String mostrarData = dataAtual.format(data);
        
            // Todos os pedidos pelo ID do usuário
            Pedido ultimoPedido = PedidoDAO.getUltimoPedido(user.getId());
            
            String status = "";
            status = ultimoPedido.getStatus_pagamento();
            
            String primeiro, segundo, terceiro, quarto;

            primeiro = "";
            segundo = "";
            terceiro = "";
            quarto = "";

            if (status.equals("1")) {
                primeiro = "display: ;";
                segundo = "display: none;";
                terceiro = "display: none;";
                quarto = "display: none;";
            } else if (status.equals("2")) {
                primeiro = "display: none;";
                segundo = "display: ;";
                terceiro = "display: none;";
                quarto = "display: none;";
            } else if (status.equals("3")) {
                primeiro = "display: none;";
                segundo = "display: none;";
                terceiro = "display: ;";
                quarto = "display: none;";
            } else if (status.equals("4")) {
                primeiro = "display: none;";
                segundo = "display: none;";
                terceiro = "display: none;";
                quarto = "display: ;";
            } else {
                primeiro = "display: none;";
                segundo = "display: none;";
                terceiro = "display: none;";
                quarto = "display: none;";
            }

        %>
    </head>
    
    <body>
        
        <!-- Navigation -->
        <div id="header"></div>  

        <div class="card principal">

            <div class="card-header">

                <span class="pedido">Pedido

                    <span id="numeroPedido" name="numeroPedido">00<%=ultimoPedido.getId_pedido()%></span>
                </span>

                <span class="data">Data atualizada:
                    <span id="dataStatus" name="dataStatus"><%= mostrarData %></span>
                </span>

            </div>

            <h3>Status do Pedido</h3>

            <span class="titulo3">
                Previsão de entrega:
                <span class="text-info" id="prazo" name="prazo"><%=ultimoPedido.getData_pedido()%></span>
            </span>

            <div class="progress" style="height: 30px; <%=primeiro%>">
                <div class="progress-bar bg-info cor" role="progressbar" style="width: 25%" aria-valuenow="10" aria-valuemin="0" aria-valuemax="100">Pedido Efetuado</div>
            </div>

            <div class="progress" style="height: 30px; <%=segundo%>">
                <div class="progress-bar bg-info cor" role="progressbar" style="width: 50%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100">Pagamento Autorizado</div>
            </div>

            <div class="progress" style="height: 30px; <%=terceiro%>">
                <div class="progress-bar bg-info cor" role="progressbar" style="width: 75%" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100">Em Transporte</div>
            </div>

            <div class="progress" style="height: 30px; <%=quarto%>">
                <div class="progress-bar bg-success cor" role="progressbar" style="width: 100%" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100">Entregue</div>
            </div>

            <%
                ArrayList<Item> lista = ultimoPedido.getItens();
                for (int i = 0; i < lista.size(); i++) {
                    out.println("<div>");
                    out.println("<img src='./imagens?id_prod='" + lista.get(i).getProduto().getId() + "'&img=1' class='img-fluid img' alt='Imagem responsiva'>");
                    // Elemento com `diplay: block;`
                    out.println("<div class='row titulo'>");
                    out.println("<p class='font-weight-normal nome' id='nomeLivro' name='nomeLivro'>Nome do Livro:" + lista.get(i).getProduto().getTitulo() + "</p>");
                    out.println("</div>");

                    //<!-- Elemento com `diplay: inline;` -->
                    out.println("<span class='font-weight-normal d-inline-block quantidade'>");
                    out.println("<span><span id='quantidade' name='quantidade'>Quantidade: " + lista.get(i).getProduto().getQuantidade() + "</span>");
                    out.println("</span>");

                    out.println("<span class='font-weight-normal d-inline-block quantidade'>");
                    out.println("<span>R$ <span id='valor' name='valor'>Valor: " + lista.get(i).getProduto().getPreco() + "</span>");
                    out.println("</span>");
                    out.println("</div>");
                }
            %>

            <hr class="barra">

            <div class="row info">
                <div class="col-sm-6">
                    <div class="card  mb-3 box" style="max-width: 18rem;">
                        <div class="card-header titulo2">Endereço de Entrega:  </div>
                        <div class="card-body text-primary">
                            <p class="card-text" id="nome" name="nome"> <%=ultimoPedido.getUsuario().getNomeRazao()%>  </p>
                            <p class="card-text" id="endereco" name="endereco"> <%=ultimoPedido.getLogradouro()%>
                                <span id="numero" name="numero"></span> <%=ultimoPedido.getNumero()%>
                            </p>
                            <p class="card-text" id="bairro" name="bairro"><%=ultimoPedido.getBairro()%></p>
                            <p class="card-text" id="cidade" name="cidade"><%=ultimoPedido.getCidade()%></p>
                            <p class="card-text"id="cep" name="cep"><%=ultimoPedido.getCep()%></p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="card  mb-3 box" style="max-width: 18rem;">
                        <div class="card-header titulo2">Total Pago</div>
                        <div class="card-body text-primary">
                            <p class="card-text">Subtotal <span class="direita" id="valor" name="valor"><%=ultimoPedido.getSubtotal()%></span> </p>
                            <p class="card-text">Frete <span class="direita" id="valorFrente" name="valorFrente"><%=ultimoPedido.getFrete()%></span> </p>
                            <hr class="barra2">
                            <p class="card-text">Valor Total <span class="direita" id="valorTotal" name="valorTotal"><%=ultimoPedido.getTotal()%></span> </p>
                        </div>
                    </div>
                </div>
            </div>

        </div>
                        
                        <!-- /.container -->
                        <!-- Footer -->
                        <div id="footer"></div>
    </body>
</html>
