<%@page import="DAO.ClienteDAO"%>
<%@page import="java.util.List"%>
<%@page import="Classes.Cliente"%>
<%@page import="java.util.ArrayList"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <!-- Meta tags Obrigatorias -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Lista de Clientes</title>

    </head>
    <body>

        <h1>Pesquisa de Usuários</h1>      

        <form action="PesquisarUsuariosServlet" method="GET">
            <input type="hidden" name="acao" value="${param.acao}" />


            <div id="dados">
                <input type="submit" id="pesquisa" value="Pesquisar" class="btn btn-primary" />
                <input type="text" class="form-control col-md-6 mb-4 border border-dark"  id="cod" name="pesquisa" value="${param.pesquisa}" placeholder="Nome">
            </div>


        </form>

        <table class="table table-striped table table-hover sortable" id="tabela">

            <tr>
                <th scope="col">ID</th>
                <th scope="col">Nome</th>
                <th scope="col">Email</th>
                <th scope="col">Nível</th>
                <!-- <th scope="col">Status</th> -->
                <th scope="col"></th>
            </tr>


            <c:forEach items="${lista}" var="usuario">
                <tr>
                    <td>${usuario.id_cliente}</td>
                    <td>${usuario.nome}</td>
                    <td>${usuario.email}</td>
                    <td>${usuario.nivel_acesso}</td>
                    <!-- <td>${usuario.ativo}</td> -->
                    <td><a href="alterarFuncionarioAdm.jsp?id=${usuario.id}">Editar</a></td>
                </tr>
            </c:forEach>

            <c:if test="${empty lista}">
                <tr>
                    <td colspan="2">Nenhum usuário localizado</td>
                </tr>

            </c:if>
        </table>

    </body>
</html>
