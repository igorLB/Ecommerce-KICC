<%@page import="modelDAO.UsuarioDAO"%>
<%@page import="model.Usuario"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <!-- Meta tags Obrigatï¿½rias -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Alterar Funcionario</title>
        <link href="res/css/bootstrap.min.css" rel="stylesheet">
        <link href="res/css/modern-business.css" rel="stylesheet">
        <script src="res/jquery-3.3.1.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="res/fonts/font-awesome-4.7.0/css/font-awesome.min.css"/>
        <link rel="stylesheet" type="text/css" href="res/css/util.css"/>
        <link rel="stylesheet" type="text/css" href="res/css/main.css"/>
        <script src="res/js/alterarFuncionarioAdm.js"></script>
        <script src="res/js/jquerymin.js"></script>
        <script src="res/js/jquerymask.js"></script
            
        <!-- IMPORTA O MENU SUPERIOR E O FOOTER -->
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script>
            $(function(){
                $("#header").load("MenuNavBar.jsp");
                $("#footer").load("Footer.jsp");
            });
        </script>
        <!-- IMPORTA O MENU SUPERIOR E O FOOTER -->

        <style>

            h2{
                margin-top: 7%;
                margin-bottom: 5%;
                text-align: center;
            }

            #corAmarelo{color:#FEB95F ;}
            #corBranca{color: white;}
            #link{color:  #090446 !important;}

            #principal{
                width: 80%;
                border: 1px solid black;
                margin-left: 10%;
                margin-bottom: 5%;
            }

            #dados{
                width: 70%;
                margin-left: 15%;
                margin-bottom: 10%;
                clear: both;
            }

            h1{
                margin-top: 7%;
                margin-bottom: 2%;
                text-align: center;
            }

            #pesquisa,#alterar, #excluir{
                color: #FEB95F;
                background: #090446;
            }

            #form{
                width: 80%;
                margin-left: 10%;
                margin-bottom: 7%;
            }

            #alterar, #excluir{
                width: 30%;
                margin-top: 5%;
                margin-left: 40%;
            }

            input{margin-bottom: 3%;}

            #espaco{
                margin-top: 4%;
                margin-left: 7%;
            }

            label{font-weight: bolder;}

            #ativar, #desativar{
                width: 30%;
                margin-top: 5%;
                color: #FEB95F;
                float: right;
                background: #090446;
            }


        </style>


        <!--  Session -->
        <%
            //Para pegar as informações do usuário, através da página listaUsuarioFuncionario.jsp
            String email = request.getSession().getAttribute("email").toString();
            Usuario user = new UsuarioDAO().getUsuario(email);

                if (!user.getNivel_usuario().equals("1")) {
                    response.sendRedirect("paginaNaoEncontrada.jsp");
                }

            
            // Retorna o tipo de sexo
            String fem = "";
            String masc = "";
            if (user.getSexo().equals("f") || user.getSexo().equals("F")) {
                fem = "checked";
            } else if (user.getSexo().equals("m") || user.getSexo().equals("M")) {
                masc = "checked";
            } else {

            }
            
            // Retorna o status do usuário
            String sim = "";
            String nao = "";
            if (user.getAtivo().equals("1")) {
                sim = "checked";
            } else if (user.getAtivo().equals("0")) {
                nao = "checked";
            } else {

            }
            
            //Retorna o Nível cadastrado no banco
            String nivel = "";
            if(user.getNivel_usuario().equals("1")){
                nivel = "Administrador";
            } else if(user.getNivel_usuario().equals("2")){
                nivel = "Funcionário";
            } else if(user.getNivel_usuario().equals("3")) {
                nivel = "Cliente";
            } else {
                nivel = "";
            }
        %>
    </head>
    <body>
        <div id="header"></div>
        
        <h1><span id="nome" name="nome">Editar Usuário ID: <%= user.getId()%></h1>

    <form method="post" id="form" name="form" action="AlterarUsuarioAdminServlet?id=<%= user.getId()%>">
        <!--Login e Senha -->
        <div class="form-row">
            <div class="col-md-6 mb-8">
                <label>Email:</label>
                <input  class="form-control border border-dark" type="email" name="email" id="email" maxlength="40" value="<%= user.getEmail()%>" required/>
            </div>
            <div class="col-md-3 mb-8">
                <label>Senha:</label>
                <input type="password" class="form-control border border-dark" name="senha" maxlength="20" id="senha" value="<%= user.getSenha()%>" required>
            </div>

            <div class="form-group col-md-3">
                <label for="inputState">Perfil</label>
                <select id="perfil" name="Nivel_Usuario" class="form-control border border-dark" required>
                    <option selected value="<%= user.getNivel_usuario()%>"><%= nivel %></option>
                    <option name="Nivel_Usuario" value="1">Administrador</option>
                    <option name="Nivel_Usuario" value="2">Funcionário</option>
                    <option name="Nivel_Usuario" value="3">Cliente</option>
                </select>
            </div>
        </div>

        <!-- Nome  e CPF-->
        <div class="form-row">
            <div class="col-md-8 mb-8">
                <label>Nome Completo:</label>
                <input type="text" class="form-control border border-dark" name="nomeRazao" id="nome" maxlength="40" value="<%= user.getNomeRazao()%>" required>
            </div>

            <div class="col-md-4 mb-8">
                <label>CPF</label>
                <input type="text"class="form-control border border-dark" name="cpf_cnpj" id="cpf" maxlength="18" value="<%= user.getCpf_cnpj()%>" required>
            </div>
        </div>

        <!-- Data Nascimento e Sexo -->
        <div class="form-row">

            <div class="col-md-6 mb-8">
                <div class="form-group">
                    <label >Sexo:</label>
                    <div class="form-check form-check-inline " id="espaco">
                        <input class="form-check-input" type="radio"  name="sexo" id="feminino" <%= fem%> value="f">
                        <label class="form-check-label">Feminino</label>
                    </div>
                    <div class="form-check form-check-inline" id="espaco">
                        <input class="form-check-input" type="radio" name="sexo" id="masculino" <%= masc%> value="m">
                        <label class="form-check-label">Masculino</label>
                    </div>
                </div>
            </div>
            <div class="col-md-6 mb-8">
                <div class="form-group">
                    <label >Status:</label>
                    <div class="form-check form-check-inline " id="espaco">
                        <input class="form-check-input" type="radio"  name="Ativo" id="ativado" <%= sim %> value="1">
                        <label class="form-check-label">Ativado</label>
                    </div>
                    <div class="form-check form-check-inline" id="espaco">
                        <input class="form-check-input" type="radio" name="Ativo" id="desativado" <%= nao %> value="0">
                        <label class="form-check-label">Desativado</label>
                    </div>
                </div>
            </div>

        </div>

        <!-- Telefone e Celular -->
        <div class="form-row">
            <div class="col-md-6 mb-8">
                <label>Telefone:</label>
                <input type="tel" class="form-control border border-dark" name="telefone"  id="telefone" value="<%= user.getTelefone()%>" required>
            </div>

            <div class="col-md-6 mb-8">
                <label>Data de Nascimento:</label>
                <input type="date" class="form-control border border-dark" name="dataNascimento" id="data" value="<%= user.getDataNascimento()%>" required>
            </div>
            <!--
            <div class="col-md-6 mb-8">
                <label>Celular:</label>
                <input type="tel" class="form-control border border-dark" name="celular" id="celular" required>
            </div>
            -->
        </div>

        <!-- CEP , Numero  e EndereÃ§o-->
        <div class="form-row">
            <div class="col-md-4 mb-8">
                <label>CEP:</label>
                <input type="text" class="form-control border border-dark" name="cep" id="cep" value="<%= user.getCep()%>" required>
            </div>

            <div class="col-md-2 mb-8">
                <label>Numero:</label>
                <input type="text" class="form-control border border-dark" id="numero" name="numero"  maxlength="5" value="<%= user.getNumero()%>">
            </div>

            <div class="col-md-6 mb-8">
                <label>Endereço:</label>
                <input type="text" class="form-control border border-dark" name="logradouro"  id="endereco" maxlength="50" value="<%= user.getLogradouro()%>" required>
            </div>
        </div>

        <!-- Complemento e Bairro -->
        <div class="form-row">
            <div class="col-md-6 mb-8">
                <label>Complemento:</label>
                <input type="text" class="form-control border border-dark" name="complemento" id="complemento" maxlength="20" value="<%= user.getComplemento()%>">
            </div>

            <div class="col-md-6 mb-8">
                <label>Bairro:</label>
                <input type="text" class="form-control border border-dark" name="bairro" id="bairro" maxlength="20" value="<%= user.getBairro()%>" required>
            </div>
        </div>

        <!-- Estado e Cidade -->
        <div class="form-row">
            <div class="col-md-6 mb-8">
                <label>Estado:</label>
                <input type="text" class="form-control border border-dark" name="estado" id="estado" maxlength="20" value="<%= user.getEstado()%>" required>
            </div>

            <div class="col-md-6 mb-8">
                <label>Cidade:</label>
                <input type="text" class="form-control border border-dark" name="cidade" id="cidade" maxlength="20" value="<%= user.getCidade()%>" required>
            </div>
        </div>

        <!--Banco, agencia e conta -->
        <div class="form-row">
            <div class="col-md-3 mb-3">
                <label>Banco:</label>
                <input type="text" class="form-control border border-dark" name="banco" id="banco" maxlength="3" value="<%= user.getBanco()%>">
            </div>

            <div class="col-md-3 mb-3">
                <label>Agência:</label>
                <input type="text" class="form-control border border-dark" name="agencia" id="agencia" maxlength="4" value="<%= user.getAgencia()%>">
            </div>

            <div class="col-md-3 mb-3">
                <label>Conta:</label>
                <input type="text" class="form-control border border-dark" name="conta" id="conta" maxlength="10" value="<%= user.getConta()%>">
            </div>

            <div class="col-md-3 mb-3">
                <label>Digito:</label>
                <input type="text" class="form-control border border-dark" name="digito" id="digito" maxlength="2" value="<%= user.getDigito()%>">
            </div>
        </div>

        <div class="form-row">
            <div class="col-md-6 mb-3">
                <input type="submit" name="alterar" id="alterar" value="Alterar" class="btn btn-primary" />
            </div>
    </form>

            <div class="col-md-6 mb-3">
                <form method="post" action="ExcluirUsuarioServlet?id=<%= user.getId()%>" name="ex_catalogo">
                    <input type="submit" name="excluir" id="excluir" value="Excluir" class="btn btn-primary" />
                </form>
            </div>
        </div>


    <!-- Footer -->
    <div id="footer"></div>
    <!-- Bootstrap core JavaScript -->
    <script src="res/vendor/jquery/jquery.min.js"></script>
    <script src="res/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.8/jquery.mask.js"></script>

</body>
</html>
