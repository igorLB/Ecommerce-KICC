<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="cabecalho.jsp" />

<h2 class="titulo-primario">Carrinho de Produto</h2>

<table class="table">
    <thead class="thead-light">
        <th scope="col" >Nome do Produto</th>
        <th scope="col">Quantidade</th>
        <th scope="col">Valor Unitario</th>
        <th scope="col">Valor Total</th>
        <th scope="col">&nbsp;</th>
    </thead>
    <tbody>
    
        
        <tr>
            <td>Uva</td>
            <td><input type="text" id="txtquantidade" name="txtquantidade" size="4" onkeypress="limitar(this); return validarcampo(event);"></td>
            <td>R$: 10,00</td>
            <td>R$: 10,00</td>
            <td align="center"><a href="#">Remover</a></td>
        </tr>
        <tr>
            <td>Uva</td>
            <td><input type="text" id="txtquantidade" name="txtquantidade" size="4" onkeypress="limitar(this); return validarcampo(event);"></td>
            <td>R$: 10,00</td>
            <td>R$: 10,00</td>
            <td align="center"><a href="#">Remover</a></td>
        </tr>
        <tr>
            <td>Uva</td>
            <td><input type="text" id="txtquantidade" name="txtquantidade" size="4" onkeypress="limitar(this); return validarcampo(event);"></td>
            <td>R$: 10,00</td>
            <td>R$: 10,00</td>
            <td align="center"><a href="#">Remover</a></td>
        </tr>
        <tr>
            <td>Uva</td>
            <td><input type="text" id="txtquantidade" name="txtquantidade" size="4" onkeypress="limitar(this); return validarcampo(event);"></td>
            <td>R$: 10,00</td>
            <td>R$: 10,00</td>
            <td align="center"><a href="#">Remover</a></td>
        </tr>
        <tr>
            <td>Uva</td>
            <td><input type="text" id="txtquantidade" name="txtquantidade" size="4" onkeypress="limitar(this); return validarcampo(event);"></td>
            <td>R$: 10,00</td>
            <td>R$: 10,00</td>
            <td align="center"><a href="#">Remover</a></td>
        </tr>
        <tr>
            <td>Uva</td>
            <td><input type="text" id="txtquantidade" name="txtquantidade" size="4" onkeypress="limitar(this); return validarcampo(event);"></td>
            <td>R$: 10,00</td>
            <td>R$: 10,00</td>
            <td align="center"><a href="#">Remover</a></td>
        </tr>
        <tr>
            <td>Uva</td>
            <td><input type="text" id="txtquantidade" name="txtquantidade" size="4" onkeypress="limitar(this); return validarcampo(event);"></td>
            <td>R$: 10,00</td>
            <td>R$: 10,00</td>
            <td align="center"><a href="#">Remover</a></td>
        </tr>
        <tr>
            <td>Uva</td>
            <td><input type="text" id="txtquantidade" name="txtquantidade" size="4" onkeypress="limitar(this); return validarcampo(event);"></td>
            <td>R$: 10,00</td>
            <td>R$: 10,00</td>
            <td align="center"><a href="#">Remover</a></td>
        </tr>
        <tr>
            <td>Uva</td>
            <td><input type="text" id="txtquantidade" name="txtquantidade" size="4" onkeypress="limitar(this); return validarcampo(event);"></td>
            <td>R$: 10,00</td>
            <td>R$: 10,00</td>
            <td align="center"><a href="#">Remover</a></td>
        </tr>
        <tr>
            <td>Uva</td>
            <td><input type="text" id="txtquantidade" name="txtquantidade" size="4" onkeypress="limitar(this); return validarcampo(event);"></td>
            <td>R$: 10,00</td>
            <td>R$: 10,00</td>
            <td align="center"><a href="#">Remover</a></td>
        </tr>
        <tr>
            <td>Uva</td>
            <td><input type="text" id="txtquantidade" name="txtquantidade" size="4" onkeypress="limitar(this); return validarcampo(event);"></td>
            <td>R$: 10,00</td>
            <td>R$: 10,00</td>
            <td align="center"><a href="#">Remover</a></td>
        </tr>
        
    </tbody>
    <tfoot class="bg-light">
        
        <td colspan="2"></td>
        <td align="right">Total:</td>
        <td>R$: 0,00</td>
        <td colspan="1"></td>
       
    </tfoot>
</table>

<div class="row rodape-carrinho">
    <div class="col-md-4" align="left">
        &nbsp; &nbsp;
        <a href="index.jsp" >&laquo;Continuar Comprando</a>
    </div>
    <div class="col-md-4 text-center">
        <input placeholder="00000-000" title="Insira seu CEP" type="text" size="15" name="txtcep" id="txtcep" onkeypress=" limatacep(this); return validarcampo(event);"> 
        <button  class="btn btn-info" id="btncep" name="btncep">Calcular Frete</button>
    </div>
    <div class="col-md-4" align="right">
        <input type="submit" name="btnPagar" class="btn btn-primary" value=" &radic; Finalizar Pedido" > &nbsp;  &nbsp;
    </div>
</div>

<jsp:include page="rodape.jsp" />
</body>
</html>