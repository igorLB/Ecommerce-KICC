<%-- 
    Document   : alterarCarrosel
    Created on : 01/11/2018, 18:51:30
    Author     : Gleice
--%>

<%@page import="modelDAO.BannerDAO"%>
<%@page import="model.Banner"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Carrossel</title>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="res/fonts/font-awesome-4.7.0/css/font-awesome.min.css"/>
        <link rel="stylesheet" type="text/css" href="res/css/util.css"/>
        <link rel="stylesheet" type="text/css" href="res/css/main.css"/>
        <link href="res/css/bootstrap.min.css" rel="stylesheet">
        <link href="res/css/modern-business.css" rel="stylesheet">

        <!-- IMPORTA O MENU SUPERIOR E O FOOTER -->
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script>
            $(function () {
                $("#header").load("MenuNavBar.jsp");
                $("#footer").load("Footer.jsp");
            });
        </script>
        <style>

            h2{
                padding-top: 3%;
                padding-bottom: 5%;
                text-align: center;
                margin-bottom: 5%;
                color: #090446 !important;
            }

            .custom-file{
                margin-left: 10%;
                font-weight: bolder;
                padding-bottom: 15%;
            }

            .img{
                margin-bottom: 5%;
                width: 550px;
                height: 230px;
                max-width: 550px;
                max-height: 230px;
                border-style: solid;
                border-radius: 5px;
            }

            .box{
                width: 40%;
                float: left;
                margin-right: 10%;
            }

            .a{
                color: #FEB95F !important;
                background: #090446 !important;

            }


            #salvar{
                margin-left: 83%;
                margin-bottom: 5%;
                color: #090446 !important;
                background: #FEB95F !important;
                text-decoration: none;
            }

        </style>
        <%
            // Esta limitado para buscar apenas 3
            ArrayList<Banner> carrossel = BannerDAO.getCarrossel();
        %> 
    </head>
    <body>
        <div id="header"></div>

        <h2>Alterar Carrossel</h2>

        <form method="post" id= "box" action="CadastroBannerServlet" enctype="multipart/form-data">

            <div class="box">

                <div class="custom-file">
                    <div class="row">
                        <div class="col-9">
                            <input type="file" class="form-control-file"  id="imagem" name="imagem" accept="image/*">
                        </div>
                        <div class="col-2">
                            <button type="submit" class="btn btn-link a" id="visualizar" name="visualizar">Enviar</button>
                        </div>
                    </div>
                    <!-- Mensagem de resposta -->
                    <%
                        if (request.getParameter("msg") != null) {
                            out.println(request.getParameter("msg"));
                        } else {

                        }
                    %>

                </div>
                <!--
                                <div class="custom-file">
                                    <div class="row">
                                        <div class="col-9">
                                            <input type="file" class="form-control-file"  id="imagem_2" name="imagem" accept="image/*">
                                        </div>
                                        <div class="col-2">
                                            <button type="button" class="btn btn-link a " id="visualizar" name="visualizar">Visualizar</button>
                                        </div>
                                    </div>
                                </div>
                
                                <div class="custom-file">
                                    <div class="row">
                                        <div class="col-9">
                                            <input type="file" class="form-control-file" id="imagem_3" name="imagem" accept="image/*">
                                        </div>
                                        <div class="col-2">
                                            <button type="button" class="btn btn-link a" id="visualizar" name="visualizar">Visualizar</button>
                                        </div>
                                    </div>
                                </div>
                -->
            </div>

            <div class="box1">

                <img src="./banner?id_banner=<%=carrossel.get(0).getId()%>&img=1'" class="img-fluid img"  id="img">

            </div>


            <!-- <button type="button" class="btn btn-link border-dark" id="salvar" name="salvar">Visualizar</button> -->

        </form>


        <div id="footer"></div>
        <!-- Bootstrap core JavaScript -->
        <script src="res/vendor/jquery/jquery.min.js"></script>
        <script src="res/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    </body>
</html>
