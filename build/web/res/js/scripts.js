

$(document).ready(function () {

    //Quando o index estiver pronto, vai carregar lista de produtos
    getProdutos();
    
    $(document).on("click", "button.btn-comprar",function(){
        var id = $(this).parents().parents().parents().parents().attr("id");
        window.location.replace("pagina_produto.jsp?produto="+id);
    });

});


function getProdutos(){
    var REST_URL = "http://localhost:8080/WSKICC/webresources/produtos";
    
    $.ajax({
        type: "GET",
        dataType:"json",
        url: REST_URL,
        success: function (data) {
         
            montaProduto(data);
            
        }
    });
      
}

function montaProduto(data){

    for (i=0; i < 12; i++) {   
        
        if(data[i].precoPromocional == "0"){
            
            //montando um produto
            var produto = "";
            produto += "<div id='"+data[i].idProduto+"' class='col-md-3 produto'> ";
            produto += "    <div class='card quadro-produto shadow-sm'>";
            produto += "        ";
            produto += "            <div class='card mb-4 shadow-sm produto-box-image'>";
            produto += "                <img class='produto-img' src='"+data[i].imagem1+"'> ";
            produto += "            </div>";
            produto += "        ";
            produto += "        <div class='card-body produto-body'>";
            produto += "            <p class='card-text produto-nome'>";
            produto += "                <span> "+data[i].nome+" </span>";
            produto += "            </p>";
            produto += "            <div class='produto-preco'>";
            produto += "                <p>R$ "+data[i].preco+"</p>";
            produto += "                <button type='button' class='btn btn-sm btn-outline-secondary btn-comprar'>Comprar</button>";
            produto += "            </div>";
            produto += "        </div>";
            produto += "    </div>";
            produto += "</div>";

            //colocando o produto na index
            $("#product-list").append(produto);
            
        }else{
        
            //montando um produto
            var produto = "";
            produto += "<div id='"+data[i].idProduto+"' class='col-md-3 produto'> ";
            produto += "    <div class='card shadow-sm'>";
            produto += "        ";
            produto += "            <div class='card mb-4 shadow-sm'>";
            produto += "                <img class='produto-img' src='"+data[i].imagem1+"'> ";
            produto += "            </div>";
            produto += "        ";
            produto += "        <div class='card-body produto-body'>";
            produto += "            <p class='card-text produto-nome'>";
            produto += "                <span> "+data[i].nome+" </span>";
            produto += "            </p>";
            produto += "            <div class='box-produto-preco'>     ";  
            produto += "                <p class='produto-preco'>R$ "+data[i].precoPromocional+"</p>";
            produto += "                <p class='produto-preco-promo'>R$ "+data[i].preco+"</p>";
            produto += "            </div>";
            produto += "            <button type='button' class='btn btn-sm btn-outline-secondary btn-comprar'>Comprar</button>";
            produto += "        </div>";
            produto += "    </div>";
            produto += "</div>";

            //colocando o produto na index
            $("#product-list").append(produto);
        }

    }
    
}




