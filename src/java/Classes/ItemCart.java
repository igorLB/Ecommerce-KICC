package model;

public class ItemCart {
    private Produto produto;
    private int quantidade;
    
    public ItemCart () {}
    
    public ItemCart (Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }
    
}
