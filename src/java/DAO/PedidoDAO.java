package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Pedido;

public class PedidoDAO {
    
    public static Pedido getUltimoPedido(int id_usuario) {
        
        Pedido pedido = new Pedido();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM pedidos WHERE id_usuario=? limit 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_usuario);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                pedido.setId_pedido(rs.getInt("id_pedido"));
                pedido.setUsuario(UsuarioDAO.getUserById(id_usuario));
                pedido.setItens(ItemDAO.getItensDoPedido(rs.getInt("id_pedido")));
                pedido.setForma_pagamento(rs.getString("forma_pagamento"));
                pedido.setStatus_pagamento(rs.getString("status_pagamento"));
                pedido.setCep(rs.getString("cep"));
                pedido.setLogradouro(rs.getString("logradouro"));
                pedido.setNumero(rs.getString("numero"));
                pedido.setComplemento(rs.getString("complemento"));                
                pedido.setEstado(rs.getString("estado"));
                pedido.setCidade(rs.getString("cidade"));
                pedido.setBairro(rs.getString("bairro"));
                pedido.setData_pedido(rs.getDate("data_pedido"));
                pedido.setSubtotal(rs.getFloat("subtotal"));
                pedido.setFrete(rs.getFloat("frete"));
                pedido.setTotal(rs.getFloat("total"));
            }else{
                pedido = null;
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return pedido;
    }
        
    public static Pedido getPedido(int id_pedido) {
        
        Pedido pedido = new Pedido();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM pedidos WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_pedido);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                pedido.setId_pedido(rs.getInt("id_pedido"));
                pedido.setUsuario(UsuarioDAO.getUserById(rs.getInt("id_usuario")));
                pedido.setItens(ItemDAO.getItensDoPedido(id_pedido));
                pedido.setForma_pagamento(rs.getString("forma_pagamento"));
                pedido.setStatus_pagamento(rs.getString("status_pagamento"));
                pedido.setCep(rs.getString("cep"));
                pedido.setLogradouro(rs.getString("logradouro"));
                pedido.setNumero(rs.getString("numero"));
                pedido.setComplemento(rs.getString("complemento"));                
                pedido.setEstado(rs.getString("estado"));
                pedido.setCidade(rs.getString("cidade"));
                pedido.setBairro(rs.getString("bairro"));
                pedido.setData_pedido(rs.getDate("data_pedido"));
                pedido.setSubtotal(rs.getFloat("subtotal"));
                pedido.setFrete(rs.getFloat("frete"));
                pedido.setTotal(rs.getFloat("total"));
            }else{
                pedido = null;
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return pedido;
    }
    
    public static String setPedido(Pedido pedido) {
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO pedidos(id_usuario, forma_pagamento, status_pagamento, cep, logradouro,"
                       + "numero, complemento, estado, cidade, bairro, data_pedido, subtotal,"
                       + "frete, total) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pedido.getUsuario().getId());
            ps.setString(2, pedido.getForma_pagamento());
            ps.setString(3, pedido.getStatus_pagamento());
            ps.setString(4, pedido.getCep());
            ps.setString(5, pedido.getLogradouro());
            ps.setString(6, pedido.getNumero());
            ps.setString(7, pedido.getComplemento());
            ps.setString(8, pedido.getEstado());
            ps.setString(9, pedido.getCidade());
            ps.setString(10, pedido.getBairro());
            ps.setDate(11, pedido.getData_pedido());
            ps.setFloat(12, pedido.getSubtotal());
            ps.setFloat(13, pedido.getFrete());
            ps.setFloat(14, pedido.getTotal());
            
            ps.execute();            
            ps.close();
            con.close();            
            resp="ok";
            
        }catch (Exception e){
            resp = e.toString();
        }
        return resp;
    }
    
    public static ArrayList<Pedido> getPedidosDoCliente(int id_usuario) {
        
        ArrayList <Pedido> pedidos = new ArrayList();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM pedidos WHERE id_usuario=? ORDER BY data_pedido DESC";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_usuario);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Pedido pedido = new Pedido();
                pedido.setId_pedido(rs.getInt("id_pedido"));
                pedido.setUsuario(UsuarioDAO.getUserById(rs.getInt("id_pedido")));
                pedido.setForma_pagamento(rs.getString("forma_pagamento"));
                pedido.setStatus_pagamento(rs.getString("status_pagamento"));
                pedido.setCep(rs.getString("cep"));
                pedido.setLogradouro(rs.getString("logradouro"));
                pedido.setNumero(rs.getString("numero"));
                pedido.setComplemento(rs.getString("complemento"));                
                pedido.setEstado(rs.getString("estado"));
                pedido.setCidade(rs.getString("cidade"));
                pedido.setBairro(rs.getString("bairro"));
                pedido.setData_pedido(rs.getDate("data_pedido"));
                pedido.setSubtotal(rs.getFloat("subtotal"));
                pedido.setFrete(rs.getFloat("frete"));
                pedido.setTotal(rs.getFloat("total"));
                pedidos.add(pedido);
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return pedidos;
    }
    
    public static String atualizarPagamento(Pedido pedido) {
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "UPDATE pedidos SET status_pagamento=?"
                       + "WHERE id_pedido=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pedido.getStatus_pagamento());
            ps.setInt(2, pedido.getId_pedido());
            
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
