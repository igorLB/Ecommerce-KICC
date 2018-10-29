    <title>Pagina do Produto</title>
<body>
        <br>
        <form action="pesquisar.php" method="GET" >
        </form>
        <div class="container">
            <div class="row">
                <div  class="col-sm-7">
                    <br>
                    <br>
                    <br>
                    <br>
                    <div class="imagem-produto">
                        <div class="text-left ">
                                <div id="carregarimagemsimilares" ></div>
                            <div class="image-outras">
                                <input type="image" src="res/sem-foto.webp" value="" alt="Submit" name="imgproduto1" id="imgproduto1" class="rounded img-fluid" width="450" height="250">
                            </div>
                        </div>
                    </div>
                </div>
               <div  class="col-sm-5 md-auto">
                    <br>
                    <br>
                    <br>
                    <br>
                    <div id="painel" class="card">
                        <div class="card-body text-center" >
                            <h5 class="card-title">Nome Produto</h5>      
                            <br><b style="color:green;opacity:0.68; -moz-opacity: 0.65;filter: alpha(opacity=68);">Disponível: 5</b>
                            <br>
                            <br>
							<div>
								<p>&nbsp;R$:50,00<p>
							</div>
                                <br>
                                <div class="text-center" align="center">                                     
                                        <strong>Quantidade:</strong>
                                        <select id="parcelavalor" class="form-control" placeholder="" >
                                            <option value=""></p></option>
                                            <option value=""></option>
                                        </select>
                                    <div class="text-center">
                                       <br>
                                        <strong>Calcular Frete</strong>
                                        <input class="form-control" id="cep_destino" type="text" placeholder="Digite seu CEP">
                                         <div id="valortotal"></div>
                                        <br>
										<div class="text-center">
											<button id="calcularfrete" class="btn btn-secondary btn-lg">Calcular frete</button>
											<input type="submit" class="btn btn-primary btn-lg" name="acao" value="Carrinho">
										</div>
                                    </div>
                                </div>
                        </div>
                     </div>
                </div>
            </div>
        </div>
        <div class="container dados">
            <br>
            
            <br>
            <div id="resposta" class="jumbotron">
                <h5 class="h5">Caracteristicas</h5>
                <br>
                <br>
                <p>
                    <strong>Nome do Produto:</strong><br>
                    <br>
                    <br>
                    <strong>Descrição do Produto:</strong><br>
                    <br>
                    <br>
                    <strong>Data de Garantia:</strong>
                    <br>
               </p>
            </div>
            <div class="album py-5 bg-light" id="produtosimilares">
            <div class="container ">
                <div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
                    <h1 class="display-4 text-dark">Produtos Similares</h1>
                </div>
                <div class="row" id="img-1">
                    <div class="col-md-3">
                        <div class="card mb-4 shadow-sm">
                            <div class="zoom">
                                <img class="card-img-top" src="res/sem-foto.webp" alt="Card image cap">
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
                    <div class="col-md-3" id="img-2">
                        <div class="card mb-4 shadow-sm">
                            <div class="zoom">
                                <img class="card-img-top" src="res/sem-foto.webp" alt="Card image cap">
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
                    <div class="col-md-3" id="img-3">
                        <div class="card mb-4 shadow-sm">
                            <div class="zoom">
                                <img class="card-img-top" src="res/sem-foto.webp" alt="Card image cap">
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
                    <div class="col-md-3" id="img-4">
                        <div class="card mb-4 shadow-sm">
                            <div class="zoom">
                                <img class="rounded img-fluid" id="imagemprodutos" src="res/sem-foto.webp" alt="Card image cap"></center>
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
        </div>
</body>
</html>