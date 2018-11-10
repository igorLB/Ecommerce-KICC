package Classes;

import java.sql.Date;
import java.util.ArrayList;

public class Pedido {



    private int id_pedido;
    private Cliente usuario;
    private ArrayList<Item> itens;
    private String forma_pagamento,status_pagamento, cep, logradouro, numero, complemento, estado, cidade, bairro;
    private Date data_pedido;
    private float subtotal, frete, total;

    /**
     * @return the id_pedido
     */
    public int getId_pedido() {
        return id_pedido;
    }
    /**
     * @return the itens
     */
    public ArrayList<Item> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    /**
     * @param id_pedido the id_pedido to set
     */
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    /**
     * @return the usuario
     */
    public Cliente getUsuario() {
        return usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the forma_pagamento
     */
    public String getForma_pagamento() {
        return forma_pagamento;
    }

    /**
     * @param forma_pagamento the forma_pagamento to set
     */
    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the data_pedido
     */
    public Date getData_pedido() {
        return data_pedido;
    }

    /**
     * @param data_pedido the data_pedido to set
     */
    public void setData_pedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }

    /**
     * @return the subtotal
     */
    public float getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the frete
     */
    public float getFrete() {
        return frete;
    }

    /**
     * @param frete the frete to set
     */
    public void setFrete(float frete) {
        this.frete = frete;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the status_pagamento
     */
    public String getStatus_pagamento() {
        return status_pagamento;
    }

    /**
     * @param status_pagamento the status_pagamento to set
     */
    public void setStatus_pagamento(String status_pagamento) {
        this.status_pagamento = status_pagamento;
    }
}
