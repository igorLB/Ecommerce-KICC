<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <noscript><meta http-equiv="refresh" content="1; url=http://changegames.ga/htaccess/errojavascript.html"></noscript>
    <link rel="icon" href="res/corpo/logo3.png" type="res/image/png" sizes="16x16">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="res/CSS/style.css">
    <title>KICC</title>
    <style>
	    #btnvendas:hover,#btncontrole:hover,
#btntrocas:hover,#btndados:hover,#btncompras:hover{color:white;}

#btnvendas,#btncompras,#btncontrole,#btntrocas,#btndados{color:#000000;font-size:13px;}

    .btnMenu{
       /* border-top-right-radius:;*/
       
    }
#btnlog{
    border-radius:0px 5px 5px 0px;
}
#btndado{
    border-radius:5px 0px 0px 5px;
}
  .button2 {
    background-color: white; 
    color: black; 
    border: 1px solid #000000;
    }
    /*#008CBA*/
    .button2:hover {
    background-color: #000000;
    color: white;
    }
     .button2{
    width:175px;
    padding: 0px 5px;
    }

a:hover{
    color:white;
}
#btnlogout{
    color:white;
    font-size:13px;
}
#btnlogout:hover{
    color:#000000;
}
#btnlog{
    background:#000000;
}
#btnlog:hover{
    
background:white;
}
    @media (min-width: 320px) and (max-width: 480px) {
        
        .btndica{visibility: hidden; display:hidden;}
        #exampleInputcft1{border-radius: 5px;}
}
 
</style>
    <script>
</script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
	<a class="navbar-brand" href="#">
		<img src="res/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
    KICC
  </a>
  <div class="col-sm-3"></div>
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	<form class="form-inline my-2 my-lg-0" >
      <input class="form-control mr-sm-2" size="50" type="search" placeholder="Pesquisar" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
    </form>
	<div class="col-sm-3"></div>
    <ul class="navbar-nav mr-auto" >
      <li class="nav-item active">
        <a class="nav-link" href="#">Minha Conta<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Cadastrar</a>
      </li>
    </ul>
  </div>
</nav>
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
                            <button class="btnMenu button2" id="btndado" type="button"><a id="btndados" class="nav-link" href="">Home</a></button>
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
                <img class="d-block w-100" id="banner1" src="res/banner/1.jpg" alt="First slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" id="banner2" src="res/banner/2.jpg" alt="Second slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" id="banner3" src="res/banner/3.png" alt="Third slide">
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
        <div class="album py-5 bg-light">
            <div class="container">
                <div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
                    <h1 class="display-4 text-dark">AnÃºncios em Destaque</h1>
                </div>
                <div class="row">
                    <div class="col-md-4">
                        <div class="card mb-4 shadow-sm">
                            <div class="zoom">
                                <img class="card-img-top" src="res/images/sem-foto.webp" alt="Card image cap">
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
                                <img class="card-img-top" src="res/images/sem-foto.webp" alt="Card image cap">
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
                                <img class="card-img-top" src="res/images/sem-foto.webp" alt="Card image cap">
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
                                <img class="rounded img-fluid" id="imagemprodutos" src="res/images/sem-foto.webp" alt="Card image cap"></center>
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
                                <img class="rounded img-fluid" id="imagemprodutos" src="res/images/sem-foto.webp" alt="Card image cap"></center>
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
                                <img class="rounded img-fluid" id="imagemprodutos" src="res/images/sem-foto.webp" alt="Card image cap"></center>
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
	<div style="background-color: #141418;">
      <style>#hidden1{border-right: solid silver 1px;}
      #hidden2{border-left: solid silver 1px;}
      @media only screen and (max-width: 600px) { #hidden1{border-style: none;} #hidden2{border-style: none;} }</style>
            <br>
            <div class="row w-100 text-center">
                <div id="hidden1" class="col-md-4" >
                    <p>
                        <a href="">Fale conosco</a>
                    </p>
                    <p>
                        <a href="">Quem Somos</a>
                    </p>
                    <p>
                        <a href="">Politicas de Privacidade</a>
                    </p>
                </div>
                <div class="col-md-4">
                    <p>
                        <a href="#">Pagamentos</a>
                    <p>
                        <a href="#">Devoluções</a>
                    </p>
                    <p>
                        <a href="#">Dúvidas Frequentes</a>
                    </p>
                    </p>
                </div>
                <div id="hidden2"  class="col-md-4">
                    <p>
                        <img width="80px;" src="../images-site/mercadoPago.png">
                        <img width="80px;" src="../images-site/ssl.png">
                    <p>
                </div>
            </div>
            <div style="color: silver;" class="row w-100 text-center">
                <div class="col-md-4">
                    <p>&copy; copyrigh - 2018. KICC</p>
                </div>
                <div class="col-md-4">
                    <p>(11) 9999-9999</p>
                </div>
                <div class="col-md-4">
                    <style> #link-suport{color:#D8D8D8;}  #link-suport:hover{color:#007bff;}</style>
                    <p><a id="link-suport" href="">suportekicc@gmail.com</a></p>
                </div>
            </div>
        </div>

</body>

</html>