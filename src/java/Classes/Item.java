package model;

public class Item {
    private int id_item;
    private Pedido pedido;
    private Produto produto;
    private String status_entrega;

    /**
     * @return the id_item
     */
    public int getId_item() {
        return id_item;
    }

    /**
     * @param id_item the id_item to set
     */
    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the status_entrega
     */
    public String getStatus_entrega() {
        return status_entrega;
    }

    /**
     * @param status_entrega the status_entrega to set
     */
    public void setStatus_entrega(String status_entrega) {
        this.status_entrega = status_entrega;
    }
}
