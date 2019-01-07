
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="cabecalho.jsp" />


<div class="container-fluid containter-pesquisa">

    <div class="row">
        <div class="demo col-md-2 aside-categorias">

            <h2 class="titulo-secundario">Categorias</h2>
            <ul class="menu-marcas" id="categorias">

                <!-- CATEGORIAS AQUI -->
                
            </ul>
            
            <h2 class="titulo-secundario">Marcas</h2>
            <ul class="menu-marcas" id="marcas">

                <!-- MARCAS AQUI -->
                
            </ul>


        </div>

        <div class="col-md-10" >
            <div class="menu-horizontal">
                <h1 id="titulo-resultados" class="titulo-primario">Resultados</h1>
                <form action="PesquisaServlet" method="GET" id="formOrdenacao">
                    <input type="hidden" name="pesquisa" id="pesquisaHidden" value="">
                    <label for="ordenacao">Classificar por:</label>
                    <select name="filtro" id="ordenacao">
                        <option value="menorpreco">Menor Preço</option>
                        <option value="maiorpreco">Maior Preço</option>
                        <option value="maisrecente" selected>Mais Recente</option>
                        <option value="maisantigo">Mais Antigo</option>
                    </select>
                </form>
            </div>
          
            
            <div id="resultados">
                
                <!-- Os produtos serão listados aqui -->
                <p>Desculpe, nenhum produto encontrado</p>
                
            </div>
        </div>

    </div>
</div>

<jsp:include page="rodape.jsp" />
