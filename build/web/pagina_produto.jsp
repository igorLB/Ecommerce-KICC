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
                    
                    <p id="produto-validade" class="padding5">validade</p>
                    <div>
                        <p id="produto-preco" class="padding5">preço<p>
                    </div>
                    <div class="text-center" align="center">                                     
                        
                        <div class="text-center">

                            

                            <div class="text-center">
                                <a href="carrinho_compra.jsp" class="btn btn-primary btn-lg" name="acao" value="Adicionar ao Carrinho">Adicionar ao Carrinho</a>
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