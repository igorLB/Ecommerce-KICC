
dados = [];
categoriasEscolhidas = [];
marcasEscolhidas = [];

$(function () {

    carregarAutoComplete();

    var parametros = getParametros();
    if (parametros['filtro'] == "undefined" || parametros['filtro'] == "" || parametros['filtro'] == null) {
        getResultados();
    } else {
        getResultadosComFiltro();
    }

    $("#ordenacao").change(function () {
        var parametros = getParametros();
        $("#pesquisaHidden").val(parametros['pesquisa']);
        $("#formOrdenacao").submit();
    });
    
    $(document).on("click", "button.btn-comprar",function(){
        var id = $(this).parents().parents().parents().parents().attr("id");
        window.location.replace("pagina_produto.jsp?produto="+id);
    });


});


$(document).on("click", "ul#marcas input", function () {

    var label = $(this).next("label").text();
    var produtosCategorizados = [];

    if ($(this).is(':checked')) {
        marcasEscolhidas.push(label);

        $("#resultados").html("");
        for (i = 0; i < dados.length; i++) {
            if (marcasEscolhidas.indexOf(dados[i].marca) > -1) {
                //montando um produto
                var produto = "";
                produto += "<div id='" + dados[i].idProduto + "' class='col-md-4'> ";
                produto += "    <div class='card mb-4 shadow-sm'>";
                produto += "        <div class='zoom'>";
                produto += "            <div class='card mb-4 shadow-sm'>";
                produto += "                <img class='produto-img' src='" + dados[i].imagem1 + "'> ";
                produto += "            </div>";
                produto += "        </div>";
                produto += "        <div class='card-body'>";
                produto += "            <p class='card-text produto-nome'>";
                produto += "                <span> " + dados[i].nome + " </span>";
                produto += "            </p>";
                produto += "            <div class='produto-preco-promo'>";
                produto += "                <p>R$ " + dados[i].precoPromocional + "</p>";
                produto += "            </div>";
                produto += "            <div class='produto-preco'>     ";
                produto += "                <button type='button' class='btn btn-sm btn-outline-secondary btn-comprar'>Comprar</button>";
                produto += "                <p>R$ " + dados[i].precoPromocional + "</p>";
                produto += "            </div>";
                produto += "        </div>";
                produto += "    </div>";
                produto += "</div>";

                //colocando o produto na index
                $("#resultados").append(produto);
            }
        }
    } else {
        var index = marcasEscolhidas.indexOf(label);
        if (index > -1) {
            marcasEscolhidas.splice(index, 1);

            if (marcasEscolhidas.length > 0) {

                $("#resultados").html("");
                for (i = 0; i < dados.length; i++) {
                    if (marcasEscolhidas.indexOf(dados[i].marca) > -1) {
                        //montando um produto
                        var produto = "";
                        produto += "<div id='" + dados[i].idProduto + "' class='col-md-4'> ";
                        produto += "    <div class='card mb-4 shadow-sm'>";
                        produto += "        <div class='zoom'>";
                        produto += "            <div class='card mb-4 shadow-sm'>";
                        produto += "                <img class='produto-img' src='" + dados[i].imagem1 + "'> ";
                        produto += "            </div>";
                        produto += "        </div>";
                        produto += "        <div class='card-body'>";
                        produto += "            <p class='card-text produto-nome'>";
                        produto += "                <span> " + dados[i].nome + " </span>";
                        produto += "            </p>";
                        produto += "            <div class='produto-preco-promo'>";
                        produto += "                <p>R$ " + dados[i].precoPromocional + "</p>";
                        produto += "            </div>";
                        produto += "            <div class='produto-preco'>     ";
                        produto += "                <button type='button' class='btn btn-sm btn-outline-secondary btn-comprar'>Comprar</button>";
                        produto += "                <p>R$ " + dados[i].precoPromocional + "</p>";
                        produto += "            </div>";
                        produto += "        </div>";
                        produto += "    </div>";
                        produto += "</div>";

                        //colocando o produto na index
                        $("#resultados").append(produto);
                    }
                }
            } else {
                $("#resultados").html("");
                for (i = 0; i < dados.length; i++) {

                    //montando um produto
                    var produto = "";
                    produto += "<div id='" + dados[i].idProduto + "' class='col-md-4'> ";
                    produto += "    <div class='card mb-4 shadow-sm'>";
                    produto += "        <div class='zoom'>";
                    produto += "            <div class='card mb-4 shadow-sm'>";
                    produto += "                <img class='produto-img' src='" + dados[i].imagem1 + "'> ";
                    produto += "            </div>";
                    produto += "        </div>";
                    produto += "        <div class='card-body'>";
                    produto += "            <p class='card-text produto-nome'>";
                    produto += "                <span> " + dados[i].nome + " </span>";
                    produto += "            </p>";
                    produto += "            <div class='produto-preco-promo'>";
                    produto += "                <p>R$ " + dados[i].precoPromocional + "</p>";
                    produto += "            </div>";
                    produto += "            <div class='produto-preco'>     ";
                    produto += "                <button type='button' class='btn btn-sm btn-outline-secondary btn-comprar'>Comprar</button>";
                    produto += "                <p>R$ " + dados[i].precoPromocional + "</p>";
                    produto += "            </div>";
                    produto += "        </div>";
                    produto += "    </div>";
                    produto += "</div>";

                    //colocando o produto na index
                    $("#resultados").append(produto);

                }
            }
        }
    }
});


$(document).on("click", "ul#categorias input", function () {

    var label = $(this).next("label").text();
    var produtosCategorizados = [];

    if ($(this).is(':checked')) {
        categoriasEscolhidas.push(label);

        $("#resultados").html("");
        for (i = 0; i < dados.length; i++) {
            if (categoriasEscolhidas.indexOf(dados[i].nomeCategoria) > -1) {
                //montando um produto
                var produto = "";
                produto += "<div id='" + dados[i].idProduto + "' class='col-md-4'> ";
                produto += "    <div class='card mb-4 shadow-sm'>";
                produto += "        <div class='zoom'>";
                produto += "            <div class='card mb-4 shadow-sm'>";
                produto += "                <img class='produto-img' src='" + dados[i].imagem1 + "'> ";
                produto += "            </div>";
                produto += "        </div>";
                produto += "        <div class='card-body'>";
                produto += "            <p class='card-text produto-nome'>";
                produto += "                <span> " + dados[i].nome + " </span>";
                produto += "            </p>";
                produto += "            <div class='produto-preco-promo'>";
                produto += "                <p>R$ " + dados[i].precoPromocional + "</p>";
                produto += "            </div>";
                produto += "            <div class='produto-preco'>     ";
                produto += "                <button type='button' class='btn btn-sm btn-outline-secondary btn-comprar'>Comprar</button>";
                produto += "                <p>R$ " + dados[i].precoPromocional + "</p>";
                produto += "            </div>";
                produto += "        </div>";
                produto += "    </div>";
                produto += "</div>";

                //colocando o produto na index
                $("#resultados").append(produto);
            }
        }


    } else {
        var index = categoriasEscolhidas.indexOf(label);
        if (index > -1) {
            categoriasEscolhidas.splice(index, 1);

            if (categoriasEscolhidas.length > 0) {

                $("#resultados").html("");
                for (i = 0; i < dados.length; i++) {
                    if (categoriasEscolhidas.indexOf(dados[i].nomeCategoria) > -1) {
                        //montando um produto
                        var produto = "";
                        produto += "<div id='" + dados[i].idProduto + "' class='col-md-4'> ";
                        produto += "    <div class='card mb-4 shadow-sm'>";
                        produto += "        <div class='zoom'>";
                        produto += "            <div class='card mb-4 shadow-sm'>";
                        produto += "                <img class='produto-img' src='" + dados[i].imagem1 + "'> ";
                        produto += "            </div>";
                        produto += "        </div>";
                        produto += "        <div class='card-body'>";
                        produto += "            <p class='card-text produto-nome'>";
                        produto += "                <span> " + dados[i].nome + " </span>";
                        produto += "            </p>";
                        produto += "            <div class='produto-preco-promo'>";
                        produto += "                <p>R$ " + dados[i].precoPromocional + "</p>";
                        produto += "            </div>";
                        produto += "            <div class='produto-preco'>     ";
                        produto += "                <button type='button' class='btn btn-sm btn-outline-secondary btn-comprar'>Comprar</button>";
                        produto += "                <p>R$ " + dados[i].precoPromocional + "</p>";
                        produto += "            </div>";
                        produto += "        </div>";
                        produto += "    </div>";
                        produto += "</div>";

                        //colocando o produto na index
                        $("#resultados").append(produto);
                    }
                }
            } else {
                $("#resultados").html("");
                for (i = 0; i < dados.length; i++) {

                    //montando um produto
                    var produto = "";
                    produto += "<div id='" + dados[i].idProduto + "' class='col-md-4'> ";
                    produto += "    <div class='card mb-4 shadow-sm'>";
                    produto += "        <div class='zoom'>";
                    produto += "            <div class='card mb-4 shadow-sm'>";
                    produto += "                <img class='produto-img' src='" + dados[i].imagem1 + "'> ";
                    produto += "            </div>";
                    produto += "        </div>";
                    produto += "        <div class='card-body'>";
                    produto += "            <p class='card-text produto-nome'>";
                    produto += "                <span> " + dados[i].nome + " </span>";
                    produto += "            </p>";
                    produto += "            <div class='produto-preco-promo'>";
                    produto += "                <p>R$ " + dados[i].precoPromocional + "</p>";
                    produto += "            </div>";
                    produto += "            <div class='produto-preco'>     ";
                    produto += "                <button type='button' class='btn btn-sm btn-outline-secondary btn-comprar'>Comprar</button>";
                    produto += "                <p>R$ " + dados[i].precoPromocional + "</p>";
                    produto += "            </div>";
                    produto += "        </div>";
                    produto += "    </div>";
                    produto += "</div>";

                    //colocando o produto na index
                    $("#resultados").append(produto);

                }
            }
        }
    }


});

function getResultados() {

    var REST_URL = "http://localhost:8080/WSKICC/webresources/produtos/buscar/";
    var parametros = getParametros();

    REST_URL = REST_URL + parametros['pesquisa'];

    $.ajax({
        url: REST_URL,
        type: "GET",
        dataType: "json",
        success: function (data) {

            dados = data;


            $("#titulo-resultados").text("Resultados de '" + parametros['pesquisa'] + "'");
            $("#resultados").html("");
            $("#marcas").html("");
            $("#categorias").html("");
            var categorias = ["a"];
            var marcas = ["a"];


            for (i = 0; i < data.length; i++) {
                if (categorias.indexOf(data[i].nomeCategoria) == -1) {
                    categorias.push(data[i].nomeCategoria);
                    var categoria = "<li> <input type='checkbox' id='" + data[i].idCategoria + "' /><label for='" + data[i].idCategoria + "'>" + data[i].nomeCategoria + "</label> </li>";

                    $("#categorias").append(categoria);
                }
            }

            for (i = 0; i < data.length; i++) {
                if (marcas.indexOf(data[i].marca) == -1) {
                    marcas.push(data[i].marca);
                    var marca = "<li> <input type='checkbox' id='" + data[i].marca + "' /><label for='" + data[i].marca + "'>" + data[i].marca + "</label> </li>";

                    $("#marcas").append(marca);
                }
            }


            for (i = 0; i < data.length; i++) {

                //montando um produto
                var produto = "";
                produto += "<div id='" + data[i].idProduto + "' class='col-md-4'> ";
                produto += "    <div class='card mb-4 shadow-sm'>";
                produto += "        <div class='zoom'>";
                produto += "            <div class='card mb-4 shadow-sm'>";
                produto += "                <img class='produto-img' src='" + data[i].imagem1 + "'> ";
                produto += "            </div>";
                produto += "        </div>";
                produto += "        <div class='card-body'>";
                produto += "            <p class='card-text produto-nome'>";
                produto += "                <span> " + data[i].nome + " </span>";
                produto += "            </p>";
                produto += "            <div class='produto-preco-promo'>";
                produto += "                <p>R$ " + data[i].precoPromocional + "</p>";
                produto += "            </div>";
                produto += "            <div class='produto-preco'>     ";
                produto += "                <button type='button' class='btn btn-sm btn-outline-secondary btn-comprar'>Comprar</button>";
                produto += "                <p>R$ " + data[i].precoPromocional + "</p>";
                produto += "            </div>";
                produto += "        </div>";
                produto += "    </div>";
                produto += "</div>";

                //colocando o produto na index
                $("#resultados").append(produto);

            }
        }
    });

}

function listaProdutos(data) {
    $("#resultados").html("");
    for (i = 0; i < data.length; i++) {
        //montando um produto
        var produto = "";
        produto += "<div id='" + data[i].idProduto + "' class='col-md-4'> ";
        produto += "    <div class='card mb-4 shadow-sm'>";
        produto += "        <div class='zoom'>";
        produto += "            <div class='card mb-4 shadow-sm'>";
        produto += "                <img class='produto-img' src='" + data[i].imagem1 + "'> ";
        produto += "            </div>";
        produto += "        </div>";
        produto += "        <div class='card-body'>";
        produto += "            <p class='card-text produto-nome'>";
        produto += "                <span> " + data[i].nome + " </span>";
        produto += "            </p>";
        produto += "            <div class='produto-preco-promo'>";
        produto += "                <p>R$ " + data[i].precoPromocional + "</p>";
        produto += "            </div>";
        produto += "            <div class='produto-preco'>     ";
        produto += "                <button type='button' class='btn btn-sm btn-outline-secondary btn-comprar'>Comprar</button>";
        produto += "                <p>R$ " + data[i].precoPromocional + "</p>";
        produto += "            </div>";
        produto += "        </div>";
        produto += "    </div>";
        produto += "</div>";

        //colocando o produto na index
        $("#resultados").append(produto);
    }

}

function getResultadosComFiltro() {

    var REST_URL = "http://localhost:8080/WSKICC/webresources/produtos/buscar/";
    var parametros = getParametros();

    REST_URL = REST_URL + parametros['pesquisa'] + "/" + parametros['filtro'];

    $.ajax({
        url: REST_URL,
        type: "GET",
        dataType: "json",
        success: function (data) {

            dados = data;

            $("#titulo-resultados").text("Resultados de '" + parametros['pesquisa'] + "'");
            $("#resultados").html("");
            $("#marcas").html("");
            $("#categorias").html("");
            var categorias = ["a"];
            var marcas = ["a"];

            for (i = 0; i < data.length; i++) {
                if (categorias.indexOf(data[i].nomeCategoria) == -1) {
                    categorias.push(data[i].nomeCategoria);
                    var categoria = "<li> <input type='checkbox' id='" + data[i].idCategoria + "' /><label for='" + data[i].idCategoria + "'>" + data[i].nomeCategoria + "</label> </li>";

                    $("#categorias").append(categoria);
                }
            }

            for (i = 0; i < data.length; i++) {
                if (marcas.indexOf(data[i].marca) == -1) {
                    marcas.push(data[i].marca);
                    var marca = "<li> <input type='checkbox' id='" + data[i].marca + "' /><label for='" + data[i].marca + "'>" + data[i].marca + "</label> </li>";

                    $("#marcas").append(marca);
                }
            }


            for (i = 0; i < data.length; i++) {

                //montando um produto
                var produto = "";
                produto += "<div id='" + data[i].idProduto + "' class='col-md-4'> ";
                produto += "    <div class='card mb-4 shadow-sm'>";
                produto += "        <div class='zoom'>";
                produto += "            <div class='card mb-4 shadow-sm'>";
                produto += "                <img class='produto-img' src='" + data[i].imagem1 + "'> ";
                produto += "            </div>";
                produto += "        </div>";
                produto += "        <div class='card-body'>";
                produto += "            <p class='card-text produto-nome'>";
                produto += "                <span> " + data[i].nome + " </span>";
                produto += "            </p>";
                produto += "            <div class='produto-preco-promo'>";
                produto += "                <p>R$ " + data[i].precoPromocional + "</p>";
                produto += "            </div>";
                produto += "            <div class='produto-preco'>     ";
                produto += "                <button type='button' class='btn btn-sm btn-outline-secondary btn-comprar'>Comprar</button>";
                produto += "                <p>R$ " + data[i].precoPromocional + "</p>";
                produto += "            </div>";
                produto += "        </div>";
                produto += "    </div>";
                produto += "</div>";

                //colocando o produto na index
                $("#resultados").append(produto);

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

function carregarAutoComplete() {

    var itens = [];

    var REST_URL = "http://localhost:8080/WSKICC/webresources/produtos";

    $.ajax({
        type: "GET",
        dataType: "json",
        url: REST_URL,
        success: function (data) {

            for (i = 0; i < data.length; i++) {

                itens.push(data[i].nome);

            }
        }
    });

    $("#txtPesquisa").autocomplete({
        source: itens
    });
}