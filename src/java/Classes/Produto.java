package Classes;

import java.io.InputStream;
import java.sql.Date;

/**
 *
 * @author igorc, Cristiano
 */

public class Produto extends Utilitarios{

    private Date dataValidade;
    private float preco, preco_promocional, peso;
    private int id_produto, id_categoria, quantidade, ativo;
    private String nome, descricao, marca;
    private InputStream imagem_1, imagem_2, imagem_3, imagem_4, imagem_5;
    
    /**
     * @return the dataValidade
     */
    public Date getDataValidade() {
        return dataValidade;
    }

    /**
     * @param dataValidade the dataValidade to set
     */
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the preco_promocional
     */
    public float getPreco_promocional() {
        return preco_promocional;
    }

    /**
     * @param preco_promocional the preco_promocional to set
     */
    public void setPreco_promocional(float preco_promocional) {
        this.preco_promocional = preco_promocional;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the id_produto
     */
    public int getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return the id_categoria
     */
    public int getId_categoria() {
        return id_categoria;
    }

    /**
     * @param id_categoria the id_categoria to set
     */
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the ativo
     */
    public int getAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the imagem_1
     */
    public InputStream getImagem_1() {
        return imagem_1;
    }

    /**
     * @param imagem_1 the imagem_1 to set
     */
    public void setImagem_1(InputStream imagem_1) {
        this.imagem_1 = imagem_1;
    }

    /**
     * @return the imagem_2
     */
    public InputStream getImagem_2() {
        return imagem_2;
    }

    /**
     * @param imagem_2 the imagem_2 to set
     */
    public void setImagem_2(InputStream imagem_2) {
        this.imagem_2 = imagem_2;
    }

    /**
     * @return the imagem_3
     */
    public InputStream getImagem_3() {
        return imagem_3;
    }

    /**
     * @param imagem_3 the imagem_3 to set
     */
    public void setImagem_3(InputStream imagem_3) {
        this.imagem_3 = imagem_3;
    }

    /**
     * @return the imagem_4
     */
    public InputStream getImagem_4() {
        return imagem_4;
    }

    /**
     * @param imagem_4 the imagem_4 to set
     */
    public void setImagem_4(InputStream imagem_4) {
        this.imagem_4 = imagem_4;
    }

    /**
     * @return the imagem_5
     */
    public InputStream getImagem_5() {
        return imagem_5;
    }

    /**
     * @param imagem_5 the imagem_5 to set
     */
    public void setImagem_5(InputStream imagem_5) {
        this.imagem_5 = imagem_5;
    }   
    
}
