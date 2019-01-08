

$(function () {
    var parametros = getParametros();
    var id = parametros['produto'];
    carregarProduto(id);
    
});


$(".outras-imagens img").click(function(){
    $("#imgproduto1").attr("src", $(this).attr("src")) ;
});


function carregarProduto(id){
    var REST_URL = "http://localhost:8080/WSKICC/webresources/produtos/";

    REST_URL = REST_URL + id

    $.ajax({
        url: REST_URL,
        type: "GET",
        dataType: "json",
        success: function (data) {
            console.log(data);
            if(data.idProduto > 0){
                
                if(data.precoPromocional == "0"){
                    $("#produto-nome").text( data.nome );
                    $("#produto-descricao").text( data.descricao );
                    $("#produto-preco").text( "R$"+data.preco );
                    $("#produto-preco-original").hide();
                    $("#produto-quantidade").text( "Quantidade: "+data.quantidade );               
                    $("#produto-validade").text( "Data validade: "+data.dataValidade );
                    $("#produto-marca").text( "Marca: "+data.marca );
                    $("#imgproduto1").attr("src", data.imagem1) ;
                    $("#outrasImagens1").attr("src", data.imagem1) ;
                    $("#outrasImagens2").attr("src", data.imagem2) ;
                    $("#outrasImagens3").attr("src", data.imagem3) ;
                }else{
                    $("#produto-nome").text( data.nome );
                    $("#produto-descricao").text( data.descricao );
                    $("#produto-preco-original").text( "R$"+data.preco );
                    $("#produto-preco").text( "R$"+data.precoPromocional );
                    $("#produto-quantidade").text( "Quantidade: "+data.quantidade );               
                    $("#produto-validade").text( "Data validade: "+data.dataValidade );
                    $("#produto-marca").text( "Marca: "+data.marca );
                    $("#imgproduto1").attr("src", data.imagem1) ;
                    $("#outrasImagens1").attr("src", data.imagem1) ;
                    $("#outrasImagens2").attr("src", data.imagem2) ;
                    $("#outrasImagens3").attr("src", data.imagem3) ;
                }
    
            }else{
                alert("Produto não econtrado!");
            }
        }
    });

}


function getParametros() {
    //Array de parametros 'chave=valor'
    var params = window.location.search.substring(1).split('&');

    //Criar objeto que vai conter os parametros
    var paramArray = {};

    //Passar por todos os parametros
    for (var i = 0; i < params.length; i++) {
        //Dividir os parametros chave e valor
        var param = params[i].split('=');

        //Adicionar ao objeto criado antes
        paramArray[param[0]] = param[1];
    }
    return paramArray;

}