package modelDAO;

import java.io.InputStream;
import model.Produto;
import java.sql.*;
import java.util.ArrayList;

public class ProdutoDAO {
    
    public static Produto getProduto(int id) {
        
        Produto produto = new Produto();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM produto WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                produto.setDataPublicacao(rs.getDate("dataPublicacao"));
                produto.setDataRegistro(rs.getDate("dataRegistro"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setId_usuario(rs.getInt("id_usuario"));
                produto.setId(rs.getInt("id"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setAtivo(rs.getInt("ativo"));
                produto.setAutor(rs.getString("autor"));
                produto.setEditora(rs.getString("editora"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTitulo(rs.getString("titulo"));
                produto.setGenero(rs.getString("genero"));
                produto.setIdioma(rs.getString("idioma"));
                if(rs.getBlob("imagem_1") != null){
                    produto.setImagem_1(rs.getBlob("imagem_1").getBinaryStream());
                }
                if(rs.getBlob("imagem_2") != null){
                    produto.setImagem_2(rs.getBlob("imagem_2").getBinaryStream());
                }
                if(rs.getBlob("imagem_3") != null){
                    produto.setImagem_3(rs.getBlob("imagem_3").getBinaryStream());
                }
                if(rs.getBlob("imagem_4") != null){
                    produto.setImagem_4(rs.getBlob("imagem_4").getBinaryStream());
                }
                if(rs.getBlob("imagem_5") != null){
                    produto.setImagem_5(rs.getBlob("imagem_5").getBinaryStream());
                }
            }else{
                produto = null;
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return produto;
    }
    
    public static String setProduto(Produto produto) {
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO produto(dataPublicacao, dataRegistro, preco, "
                       + "id_usuario, quantidade, ativo, autor, editora, descricao, titulo, genero, idioma,"
                       + "imagem_1, imagem_2, imagem_3, imagem_4, imagem_5) "
                       + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, produto.getDataPublicacao());
            ps.setDate(2, produto.getDataRegistro());
            ps.setFloat(3, produto.getPreco());
            ps.setInt(4, produto.getId_usuario());
            ps.setInt(5, produto.getQuantidade());
            ps.setInt(6, produto.getAtivo());
            ps.setString(7, produto.getAutor());
            ps.setString(8, produto.getEditora());
            ps.setString(9, produto.getDescricao());
            ps.setString(10, produto.getTitulo());
            ps.setString(11, produto.getGenero());
            ps.setString(12, produto.getIdioma());
            ps.setBlob(13, produto.getImagem_1());
            ps.setBlob(14, produto.getImagem_2());
            ps.setBlob(15, produto.getImagem_3());
            ps.setBlob(16, produto.getImagem_4());
            ps.setBlob(17, produto.getImagem_5());
            
            ps.execute();
            
            ps.close();
            con.close();
            
            resp="ok";
        }catch (Exception e){
            resp = e.toString();
        }
        return resp;
    }
    
    public static ArrayList<Produto> getProdutosPorTermo(String termo) {
        
        ArrayList <Produto> produtos = new ArrayList();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM produto WHERE titulo LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, termo + "%");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setDataPublicacao(rs.getDate("dataPublicacao"));
                produto.setDataRegistro(rs.getDate("dataRegistro"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setId_usuario(rs.getInt("id_usuario"));
                produto.setId(rs.getInt("id"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setAtivo(rs.getInt("ativo"));
                produto.setAutor(rs.getString("autor"));
                produto.setEditora(rs.getString("editora"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTitulo(rs.getString("titulo"));
                produto.setGenero(rs.getString("genero"));
                produto.setIdioma(rs.getString("idioma"));
                if(rs.getBlob("imagem_1") != null){
                    produto.setImagem_1(rs.getBlob("imagem_1").getBinaryStream());
                }
                if(rs.getBlob("imagem_2") != null){
                    produto.setImagem_2(rs.getBlob("imagem_2").getBinaryStream());
                }
                if(rs.getBlob("imagem_3") != null){
                    produto.setImagem_3(rs.getBlob("imagem_3").getBinaryStream());
                }
                if(rs.getBlob("imagem_4") != null){
                    produto.setImagem_4(rs.getBlob("imagem_4").getBinaryStream());
                }
                if(rs.getBlob("imagem_5") != null){
                    produto.setImagem_5(rs.getBlob("imagem_5").getBinaryStream());
                }
                produtos.add(produto);
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return produtos;
    }
    

    public static ArrayList<Produto> getProdutosPorAutor(String autor) {
        
        ArrayList <Produto> produtos = new ArrayList();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM produto WHERE autor LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, autor + "%");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setDataPublicacao(rs.getDate("dataPublicacao"));
                produto.setDataRegistro(rs.getDate("dataRegistro"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setId_usuario(rs.getInt("id_usuario"));
                produto.setId(rs.getInt("id"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setAtivo(rs.getInt("ativo"));
                produto.setAutor(rs.getString("autor"));
                produto.setEditora(rs.getString("editora"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTitulo(rs.getString("titulo"));
                produto.setGenero(rs.getString("genero"));
                produto.setIdioma(rs.getString("idioma"));
                if(rs.getBlob("imagem_1") != null){
                    produto.setImagem_1(rs.getBlob("imagem_1").getBinaryStream());
                }
                if(rs.getBlob("imagem_2") != null){
                    produto.setImagem_2(rs.getBlob("imagem_2").getBinaryStream());
                }
                if(rs.getBlob("imagem_3") != null){
                    produto.setImagem_3(rs.getBlob("imagem_3").getBinaryStream());
                }
                if(rs.getBlob("imagem_4") != null){
                    produto.setImagem_4(rs.getBlob("imagem_4").getBinaryStream());
                }
                if(rs.getBlob("imagem_5") != null){
                    produto.setImagem_5(rs.getBlob("imagem_5").getBinaryStream());
                }
                produtos.add(produto);
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return produtos;
    }
    
    public static ArrayList<Produto> getProdutosPorEditora(String editora){
            ArrayList <Produto> produtos = new ArrayList();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM produto WHERE editora LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, editora + "%");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setDataPublicacao(rs.getDate("dataPublicacao"));
                produto.setDataRegistro(rs.getDate("dataRegistro"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setId_usuario(rs.getInt("id_usuario"));
                produto.setId(rs.getInt("id"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setAtivo(rs.getInt("ativo"));
                produto.setAutor(rs.getString("autor"));
                produto.setEditora(rs.getString("editora"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTitulo(rs.getString("titulo"));
                produto.setGenero(rs.getString("genero"));
                produto.setIdioma(rs.getString("idioma"));
                if(rs.getBlob("imagem_1") != null){
                    produto.setImagem_1(rs.getBlob("imagem_1").getBinaryStream());
                }
                if(rs.getBlob("imagem_2") != null){
                    produto.setImagem_2(rs.getBlob("imagem_2").getBinaryStream());
                }
                if(rs.getBlob("imagem_3") != null){
                    produto.setImagem_3(rs.getBlob("imagem_3").getBinaryStream());
                }
                if(rs.getBlob("imagem_4") != null){
                    produto.setImagem_4(rs.getBlob("imagem_4").getBinaryStream());
                }
                if(rs.getBlob("imagem_5") != null){
                    produto.setImagem_5(rs.getBlob("imagem_5").getBinaryStream());
                }
                produtos.add(produto);
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return produtos;
    
    }
    
    public static ArrayList<Produto> getProdutosPorGenero(String genero){
             ArrayList <Produto> produtos = new ArrayList();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM produto WHERE genero LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, genero + "%");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setDataPublicacao(rs.getDate("dataPublicacao"));
                produto.setDataRegistro(rs.getDate("dataRegistro"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setId_usuario(rs.getInt("id_usuario"));
                produto.setId(rs.getInt("id"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setAtivo(rs.getInt("ativo"));
                produto.setAutor(rs.getString("autor"));
                produto.setEditora(rs.getString("editora"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTitulo(rs.getString("titulo"));
                produto.setGenero(rs.getString("genero"));
                produto.setIdioma(rs.getString("idioma"));
                if(rs.getBlob("imagem_1") != null){
                    produto.setImagem_1(rs.getBlob("imagem_1").getBinaryStream());
                }
                if(rs.getBlob("imagem_2") != null){
                    produto.setImagem_2(rs.getBlob("imagem_2").getBinaryStream());
                }
                if(rs.getBlob("imagem_3") != null){
                    produto.setImagem_3(rs.getBlob("imagem_3").getBinaryStream());
                }
                if(rs.getBlob("imagem_4") != null){
                    produto.setImagem_4(rs.getBlob("imagem_4").getBinaryStream());
                }
                if(rs.getBlob("imagem_5") != null){
                    produto.setImagem_5(rs.getBlob("imagem_5").getBinaryStream());
                }
                produtos.add(produto);
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return produtos;
    
    }
    
    public static ArrayList<Produto> getProdutos(int id_usuario) {

        
        ArrayList <Produto> produtos = new ArrayList();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM produto WHERE id_usuario=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_usuario);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setDataPublicacao(rs.getDate("dataPublicacao"));
                produto.setDataRegistro(rs.getDate("dataRegistro"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setId_usuario(rs.getInt("id_usuario"));
                produto.setId(rs.getInt("id"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setAtivo(rs.getInt("ativo"));
                produto.setAutor(rs.getString("autor"));
                produto.setEditora(rs.getString("editora"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTitulo(rs.getString("titulo"));
                produto.setGenero(rs.getString("genero"));
                produto.setIdioma(rs.getString("idioma"));
                if(rs.getBlob("imagem_1") != null){
                    produto.setImagem_1(rs.getBlob("imagem_1").getBinaryStream());
                }
                if(rs.getBlob("imagem_2") != null){
                    produto.setImagem_2(rs.getBlob("imagem_2").getBinaryStream());
                }
                if(rs.getBlob("imagem_3") != null){
                    produto.setImagem_3(rs.getBlob("imagem_3").getBinaryStream());
                }
                if(rs.getBlob("imagem_4") != null){
                    produto.setImagem_4(rs.getBlob("imagem_4").getBinaryStream());
                }
                if(rs.getBlob("imagem_5") != null){
                    produto.setImagem_5(rs.getBlob("imagem_5").getBinaryStream());
                }
                
                produtos.add(produto);
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return produtos;
    }
    
    public static String ativadoDesativado(Produto produto) {

     String resp = "";

     try {
         Connection con = Conecta.getConexao();
         String sql = "UPDATE produto SET ativo=? WHERE id=?";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setInt(1, produto.getAtivo());

         ps.setString(2, Integer.toString(produto.getId()));

         ps.execute();

         ps.close();
         con.close();

         resp = "OK";

        } catch (Exception e) {
            resp = e.toString();
        }

        return resp;
    } 
    
    public static String alterarProduto(Produto produto) {

     String resp = "";

     try {
         Connection con = Conecta.getConexao();
         String sql = "UPDATE produto SET quantidade=?, titulo=?, autor=?, editora=?, dataPublicacao=?, descricao=?, preco=? WHERE id=?";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setInt(1, produto.getQuantidade());
         ps.setString(2, produto.getTitulo());
         ps.setString(3, produto.getAutor());
         ps.setString(4, produto.getEditora());
         ps.setString(5, produto.getDataPublicacao().toString());
         ps.setString(6, produto.getDescricao());
         ps.setFloat(7, produto.getPreco());
         //ps.setString(7, produto.getIdioma());
         //ps.setString(8, produto.getGenero());

         ps.setString(8, Integer.toString(produto.getId()));

         ps.execute();

         ps.close();
         con.close();

         resp = "OK";

        } catch (Exception e) {
            resp = e.toString();
        }

        return resp;
    } 
    
    public static String excluirProduto(String idProduto) {
    String resp = "";
    try {
        Connection con = Conecta.getConexao();
        String sql = "DELETE FROM produto WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, idProduto);

        ps.execute();

        ps.close();
        con.close();

        resp="ok";
        }catch (Exception e){
            resp = e.toString();
        }
        return resp;
    }
    
    public static ArrayList<Produto> getProdutosRecentes() {
        
        ArrayList <Produto> produtos = new ArrayList();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM produto ORDER BY dataRegistro DESC LIMIT 6";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setDataPublicacao(rs.getDate("dataPublicacao"));
                produto.setDataRegistro(rs.getDate("dataRegistro"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setId_usuario(rs.getInt("id_usuario"));
                produto.setId(rs.getInt("id"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setAtivo(rs.getInt("ativo"));
                produto.setAutor(rs.getString("autor"));
                produto.setEditora(rs.getString("editora"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTitulo(rs.getString("titulo"));
                produto.setGenero(rs.getString("genero"));
                produto.setIdioma(rs.getString("idioma"));
                if(rs.getBlob("imagem_1") != null){
                    produto.setImagem_1(rs.getBlob("imagem_1").getBinaryStream());
                }
                if(rs.getBlob("imagem_2") != null){
                    produto.setImagem_2(rs.getBlob("imagem_2").getBinaryStream());
                }
                if(rs.getBlob("imagem_3") != null){
                    produto.setImagem_3(rs.getBlob("imagem_3").getBinaryStream());
                }
                if(rs.getBlob("imagem_4") != null){
                    produto.setImagem_4(rs.getBlob("imagem_4").getBinaryStream());
                }
                if(rs.getBlob("imagem_5") != null){
                    produto.setImagem_5(rs.getBlob("imagem_5").getBinaryStream());
                }
                produtos.add(produto);
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return produtos;
    }
       
    public static ArrayList<Produto> getProdutosPopulares() {
        
        ArrayList <Produto> produtos = new ArrayList();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM produto ORDER BY visualizacoes DESC LIMIT 3";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setDataPublicacao(rs.getDate("dataPublicacao"));
                produto.setDataRegistro(rs.getDate("dataRegistro"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setId_usuario(rs.getInt("id_usuario"));
                produto.setId(rs.getInt("id"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setAtivo(rs.getInt("ativo"));
                produto.setAutor(rs.getString("autor"));
                produto.setEditora(rs.getString("editora"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTitulo(rs.getString("titulo"));
                produto.setGenero(rs.getString("genero"));
                produto.setIdioma(rs.getString("idioma"));
                if(rs.getBlob("imagem_1") != null){
                    produto.setImagem_1(rs.getBlob("imagem_1").getBinaryStream());
                }
                if(rs.getBlob("imagem_2") != null){
                    produto.setImagem_2(rs.getBlob("imagem_2").getBinaryStream());
                }
                if(rs.getBlob("imagem_3") != null){
                    produto.setImagem_3(rs.getBlob("imagem_3").getBinaryStream());
                }
                if(rs.getBlob("imagem_4") != null){
                    produto.setImagem_4(rs.getBlob("imagem_4").getBinaryStream());
                }
                if(rs.getBlob("imagem_5") != null){
                    produto.setImagem_5(rs.getBlob("imagem_5").getBinaryStream());
                }
                produtos.add(produto);
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return produtos;
    }
}
    
    
   
