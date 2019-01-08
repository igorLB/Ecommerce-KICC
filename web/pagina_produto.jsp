<jsp:include page="cabecalho.jsp" />

<div class="container container-pagina-produto">
    <div class="row">
        <div  class="col-md-7 ">
            <div class="row imagem-produto">
                <img src="" name="imgproduto1" id="imgproduto1" class="rounded img-fluid">   
            </div>
            <div class="row outras-imagens d-flex justify-content-between">
                <div class="col-md-4"> <img class="" id="outrasImagens1" src="" alt="Imagem produto 1">  </div>
                <div class="col-md-4"> <img class="" id="outrasImagens2" src="" alt="Imagem produto 2">  </div>
                <div class="col-md-4"> <img class="" id="outrasImagens3" src="" alt="Imagem produto 3">  </div>
            </div>
        </div>

        <div  class="col-md-5">
            <div id="painel" class="card">
                <div class="card-body " >

                    <h2 class="" id="produto-nome">Nome Produto</h2>    
                    <p id="produto-descricao">Descrição do produto</p>
                    <p id="produto-quantidade" class="">quantidade</p>
                    <p id="produto-marca" class="">marca</p>
                    <p id="produto-validade" class="">validade</p>
                    <p id="produto-preco-original" class="text-center">preço promo<p>
                    <p id="produto-preco" class="text-center">preço<p>


                    <div class="text-center" align="center">                                     
                        <a href="carrinho_compra.jsp" class="btn btn-primary btn-lg" name="acao" value="Adicionar ao Carrinho"><i class="fas fa-cart-plus"></i>Adicionar ao Carrinho</a>
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