window.onload = function () {

    document.getElementById("namelivro").onkeypress = function () {
        return Onlychars(event);
    };
    
    document.getElementById("nameAutor").onkeypress = function () {
        return Onlychars(event);
    };
    
    document.getElementById("nameEditora").onkeypress = function () {
        return Onlychars(event);
    };
    
    
    document.getElementById("valor").onkeypress = function () {
        return Onlynumbers(event);
    };
    
    
    
    document.getElementById("descricaoProduto").onkeypress = function () {
        return Onlychars(event);
    };

        
    document.getElementById("anoLancamento").onkeypress = function () {
        return Onlynumbers(event);
    };
    


};

$(".editar").click(function(){
    var id = $(this).attr('id');
    console.log(id);
    $.ajax({
        type: "POST",
        url: "GetProdutoServlet",
        dataType: "json",
        data: {
            id: id
        }, success: function(data){
            $("#namelivro").val(data.titulo);
            $("#nameAutor").val(data.autor);
            $("#nameEditora").val(data.editora);
            $("#anoLancamento").val(data.dataPublicacao);
            $("#idValor").val(data.preco);
            $("#descricaoProduto").val(data.descricao);
        }, error: function(e){
            console.log(e);
        }
    });
});

function Onlynumbers(e) {
    var tecla = new Number();
    if (window.event) {
        tecla = e.keyCode;
    } else if (e.which) {
        tecla = e.which;
    } else {
        return true;
    }
    if ((tecla >= "97") && (tecla <= "122")) {
        return false;
    }
}

function Onlychars(e) {
    var tecla = new Number();
    if (window.event) {
        tecla = e.keyCode;
    } else if (e.which) {
        tecla = e.which;
    } else {
        return true;
    }
    if ((tecla >= "48") && (tecla <= "57")) {
        return false;
    }
}