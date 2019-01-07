

$(function () {
    var parametros = getParametros();
    var id = parametros['produto'];
    carregarProduto(id);

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
                $("#produto-nome").text( data.nome );
                $("#produto-preco").text( "R$"+data.preco );
                $("#produto-quantidade").text( "Quantidade: "+data.quantidade );
               
                $("#produto-validade").text( "Data validade: "+data.dataValidade );
                $("#produto-marca").text( "Marca: "+data.marca );
                $("#imgproduto1").attr("src", data.imagem1) ;
                
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