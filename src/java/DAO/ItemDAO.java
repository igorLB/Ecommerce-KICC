package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Item;

public class ItemDAO {
    
    public static String setItem(Item item) {
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO itens(id_pedido, id_produto, status_entrega)"
                       + "VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, item.getPedido().getId_pedido());
            ps.setInt(2, item.getProduto().getId());
            ps.setString(3, item.getStatus_entrega());
            
            ps.execute();            
            ps.close();
            con.close();            
            resp="ok";
            
        }catch (Exception e){
            resp = e.toString();
        }
        return resp;
    }
    
    public static ArrayList<Item> getItensDoVendedor(int id_usuario) {
        
        ArrayList <Item> itens = new ArrayList();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT itens.id_item, itens.id_pedido, itens.id_produto, itens.status_entrega, pedidos.data_pedido " +
                         "FROM itens " +
                         "INNER JOIN produto on itens.id_produto = produto.id " +
                         "INNER JOIN pedidos on itens.id_pedido = pedidos.id_pedido " +
                         "WHERE produto.id_usuario = ?" +
                         "ORDER BY pedidos.data_pedido DESC";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_usuario);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Item item = new Item();                
                item.setId_item(rs.getInt("id_item"));
                item.setPedido(PedidoDAO.getPedido(rs.getInt("id_pedido")));
                item.setProduto(ProdutoDAO.getProduto(rs.getInt("id_produto")));
                item.setStatus_entrega(rs.getString("status_entrega"));
                itens.add(item);
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return itens;
    }
    public static ArrayList<Item> getItensDoPedido(int id_pedido) {
        
        ArrayList<Item> itens = new ArrayList();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT id_item, id_pedido, id_produto, status_entrega " +
                         "FROM itens " +
                         "WHERE id_pedido = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_pedido);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Item item = new Item();                
                item.setId_item(rs.getInt("id_item"));
                item.setPedido(PedidoDAO.getPedido(rs.getInt("id_pedido")));
                item.setProduto(ProdutoDAO.getProduto(rs.getInt("id_produto")));
                item.setStatus_entrega(rs.getString("status_entrega"));
                itens.add(item);
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return itens;
    }
    
    public static String atualizarEntrega(Item item) {
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "UPDATE itens SET status_entrega = ?"
                       + "WHERE id_item = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, item.getStatus_entrega());
            ps.setInt(2, item.getId_item());
            
            ps.execute();            
            ps.close();
            con.close();            
            resp="ok";
            
        }catch (Exception e){
            resp = e.toString();
        }
        return resp;
    }
}
