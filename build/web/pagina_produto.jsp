<jsp:include page="cabecalho.jsp" />

<div class="container">
    <div class="row">
        <div  class="col-sm-7">
            <div class="imagem-produto">
                <div class="text-left ">
                    <div id="carregarimagemsimilares" ></div>
                    <div class="image-outras">
                        <input type="image" src="" value="" alt="Submit" name="imgproduto1" id="imgproduto1" class="rounded img-fluid" width="450" height="250">
                    </div>
                </div>
            </div>
        </div>
        
        <div  class="col-sm-5">
            <div id="painel" class="card">
                <div class="card-body text-center" >
                    <h5 class="card-title padding5" id="produto-nome">Nome Produto</h5>      
                    <strong id="produto-quantidade" class="padding5">quantidade</strong>
                    <p id="produto-marca" class="padding5">marca</p>
                    <div>
                        <p id="produto-preco" class="padding5">preço<p>
                    </div>
                    <div class="text-center" align="center">                                     
                        
                        <div class="text-center">

                            <strong>Calcular Frete</strong>
                            <input class="form-control" id="cep_destino" type="text" placeholder="Digite seu CEP">
                            <div id="valortotal"></div>

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

<script src="res/js/produto.js"></script>
<jsp:include page="rodape.jsp" />
</body>
</html>