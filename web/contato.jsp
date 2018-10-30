<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <!-- Meta tags Obrigatórias -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">    


    </head>
    <body>
        <!-- Conteúdo início -->

        <h3>Contate-nos</h3>
        <br> <br> 
        <form id="form1" method="post" action="EnviaEmailServlet">

            <!-- Nome -->

            <label id="texto">Nome <span class="alerta"></span>*</label><br> 
            <input type="text" class="form-control col-md-10  border border-dark" id="nome" name="nome"  maxlength="40" value="" required="required">
            <br> <br> 

            <!-- Email -->

            <label id="texto">Email <span class="alerta">*</span></label><br> 
            <input type="email" class="form-control col-md-10  border border-dark" id="email" maxlength="45" name="email" value="" required="required">

            <br> <br> 
            <!-- Assunto -->

            <label id="texto">Assunto <span class="alerta">*</span></label><br> 
            <select id="assunto" class="form-control col-md-10  border border-dark" name="assunto" required="required"><br> 
                <option selected>Dúvidas</option>
                <option>Reclamações</option>
                <option>Cancelamento</option>
                <option>Outros Assuntos</option>
            </select>
            <br> <br> 

            <!-- Mensagem -->

            <label id="texto">Mensagem <span class="alerta">*</span></label><br> 
            <textarea class="form-control col-md-8  border border-dark" id="mensagem" rows="7" maxlength="2000" name="mensagem" required="required"></textarea><br> 
            * Campos obrigatórios
            <br> <br> 

            <button type="submit" class="btn btn-primary" id="botao2">Enviar</button>
        </form>    

        <!-- Mensagem de resposta -->
        <%=request.getParameter("msg")%>




        <!-- Conteúdo fim -->

    </body>
</html>