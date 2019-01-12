<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="cabecalho.jsp" />


<!-- SLIDER -->
<div id="carouselExampleIndicators" class="carousel slide carousel-fade" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img class="d-block w-100" id="banner1" src="res/banner/Banner1.jpg" alt="First slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" id="banner2" src="res/banner/Banner2.jpg" alt="Second slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" id="banner3" src="res/banner/banner3.jpg" alt="Third slide">
        </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>


<main role="main">
    <!--
    <section class="jumbotron text-center bg-white">
        <div class="container">
            <h1 class="jumbotron-heading">KICC</h1>
            <p class="lead text-muted">Departamento de Alimentos e Bebidas com as melhores Ofertas e Promoções nas loja KICC.com. Compra segura, preço baixo e entrega rápida!</p>
        <hr>
    </section>
    -->
    
    <!-- BOX PRODUTOS -->
    <div class="album py-5">
        <div class="container">
            <div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
                <h1 class="display-4 text-dark">Produtos Populares</h1>
                <div class="row product-list" id="product-list">

                    <!-- PRODUTOS VAO SER LISTADOS AQUI VIA JQUERY -->

                </div>
            </div>	
        </div>
    </div>
 
</main>
<script src="res/js/scripts.js"></script>
<jsp:include page="rodape.jsp" />
</body>
</html>