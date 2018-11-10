<%@page import="modelDAO.ProdutoDAO"%>
<%@page import="Classes.Produto"%>
<%@page import="java.util.ArrayList"%>
<%page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="cabecalho.jsp" />
    <div class="container">
    <div class="col-sm-14 mr-auto ml-auto" align="" > 
            <nav class="navbar navbar-expand-lg navbar-light">
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                      </button>
                <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
                    <a class="navbar-brand" href="#"></a>
                    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                        <li class="nav-item active">
                            <button class="btnMenu button2" id="btndado" type="button"><a id="btndados" class="nav-link" href="index.jsp">Home</a></button>
                        </li>
                        <li class="nav-item">
                            <button class="btnMenu button2" type="button"><a id="btnvendas" class="nav-link " href="#">Produto</a></button>
                        </li>
                        <li class="nav-item">
                            <button class="btnMenu button2" type="button"><a id="btntrocas" class="nav-link" href="#">Produto</a></button>
                        </li>
                        <li class="nav-item">
                            <button class="btnMenu button2" type="button"><a id="btncompras" class="nav-link" href="#">Produtos</a></button>
                        </li>
                        <li class="nav-item">
                            <button class="btnMenu button2" type="button"><a id="btncontrole" class="nav-link" href="">Produto</a></button>
                        </li>
                        <li class="nav-item">
                            <button class="btnMenu button2" id="btnlog" type="button"><a id="btnlogout" class="nav-link" href="">Sobre o KICC</a></button>
                        </li>
                     </ul>
                 </div>
            </nav>
     </div>
</div>
 <div id="carouselExampleIndicators" class="carousel slide carousel-fade" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="d-block w-100" id="banner1" src="banner/1.jpg" alt="First slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" id="banner2" src="banner/2.jpg" alt="Second slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" id="banner3" src="banner/3.png" alt="Third slide">
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
        <section class="jumbotron text-center">
            <div class="container">
                <h1 class="jumbotron-heading">KICC</h1>
                <p class="lead text-muted">Departamento de Alimentos e Bebidas com as melhores Ofertas e Promoções nas loja KICC.com. Compra segura, preço baixo e entrega rápida!</p>
            <hr>
        </section>
        
        <!-- Produtos -->
      <%
      ArrayList<Produto> listaPop = ProdutoDAO.getProdutosPopulares();
      %>
      
        <div class="album py-5 bg-light">
            <div class="container">
                <div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
                    <h1 class="display-4 text-dark">An�ncios em Destaque</h1>
                </div>
                <div class="row">
                    <div class="col-md-4">
                        <div class="card mb-4 shadow-sm">
                            <div class="zoom">
                                <img class="card-img-top" src="images/sem-foto.webp" alt="Card image cap">
                            </div>
                            <div class="card-body">
                                <p class="card-text">Produto</p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Compra</button>
                                    </div>
                                    <small class="text-muted">R$ 30,00</small>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="card mb-4 shadow-sm">
                            <div class="zoom">
                                <img class="card-img-top" src="images/sem-foto.webp" alt="Card image cap">
                            </div>
                            <div class="card-body">
                                <p class="card-text">Produto</p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Compra</button>
                                    </div>
                                    <small class="text-muted">R$ 5,00</small>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="card mb-4 shadow-sm">
                            <div class="zoom">
                                <img class="card-img-top" src="images/sem-foto.webp" alt="Card image cap">
                            </div>
                            <div class="card-body">
                                <p class="card-text">Produto</p>
                                <div class="d-flex justify-content-between align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Compra</button>
                                    </div>
                                    <small class="text-muted">R$ 50,00</small>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="card mb-4 shadow-sm">
                            <div class="zoom">
                                <img class="rounded img-fluid" id="imagemprodutos" src="images/sem-foto.webp" alt="Card image cap"></center>
                            </div>
                            <div class="card-body">
                                <p class="card-text">Produto</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary">Compra</button>
								</div>
                                    <small class="text-muted">R$ 30,00</small>
                                </div>
                            </div>
                        </div>
                    </div>
					<div class="col-md-4">
                        <div class="card mb-4 shadow-sm">
                            <div class="zoom">
                                <img class="rounded img-fluid" id="imagemprodutos" src="images/sem-foto.webp" alt="Card image cap"></center>
                            </div>
                            <div class="card-body">
                                <p class="card-text">Produto</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary">Compra</button>
								</div>
                                    <small class="text-muted">R$ 30,00</small>
                                </div>
                            </div>
                        </div>
                    </div>
					<div class="col-md-4">
                        <div class="card mb-4 shadow-sm">
                            <div class="zoom">
                                <img class="rounded img-fluid" id="imagemprodutos" src="images/sem-foto.webp" alt="Card image cap"></center>
                            </div>
                            <div class="card-body">
                                <p class="card-text">Produto</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
									<button type="button" class="btn btn-sm btn-outline-secondary">Compra</button>
								</div>
                                    <small class="text-muted">R$ 30,00</small>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
	<jsp:include page="rodape.jsp" />
</body>
</html>