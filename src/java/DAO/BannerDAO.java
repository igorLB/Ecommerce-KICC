package modelDAO;

import java.io.InputStream;
import model.Produto;
import java.sql.*;
import java.util.ArrayList;
import model.Banner;

public class BannerDAO {
    
    public static Banner getBanner(int id) {
        
        Banner banner = new Banner();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM banner WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                banner.setId(rs.getInt("id"));
                banner.setPosicao(rs.getInt("posicao"));
                banner.setTitulo(rs.getString("titulo"));
                banner.setDescricao(rs.getString("descricao"));
                banner.setData_cadastro(rs.getDate("data_cadastro"));
                banner.setData_validade(rs.getDate("data_validade"));
                banner.setAtivo(rs.getInt("ativo"));
                banner.setUrl(rs.getString("url"));
                if(rs.getBlob("imagem") != null){
                    banner.setImagem(rs.getBlob("imagem").getBinaryStream());
                }
            }else{
                banner = null;
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return banner;
    }
    
    public static String setBanner(Banner banner) {
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            //String sql = "INSERT INTO banner(posicao, titulo, descricao, "
            //           + "data_cadastro, data_validade, ativo, url, imagem) "
            //           + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
                        String sql = "INSERT INTO banner(posicao, data_cadastro, ativo, imagem) VALUES(?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, banner.getPosicao());
            //ps.setString(1, banner.getTitulo());
            //ps.setString(3, banner.getDescricao());
            ps.setDate(2, banner.getData_cadastro());
            //ps.setDate(5, banner.getData_validade());
            ps.setInt(3, banner.getAtivo());
            //ps.setString(7, banner.getUrl());
            ps.setBlob(4, banner.getImagem());
            
            ps.execute();
            
            ps.close();
            con.close();
            
            resp="OK";
        }catch (Exception e){
            resp = e.toString();
        }
        return resp;
    }
    
    public static ArrayList<Banner> getCarrossel() {
        
        ArrayList <Banner> imagens = new ArrayList();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM banner ORDER BY id DESC LIMIT 3";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Banner carrossel = new Banner();
                
                carrossel.setId(rs.getInt("id"));
                //carrossel.setPosicao(rs.getInt("posicao"));
                //carrossel.setTitulo(rs.getString("titulo"));
                //carrossel.setDescricao(rs.getString("descricao"));
                carrossel.setData_cadastro(rs.getDate("data_cadastro"));
                //carrossel.setData_validade(rs.getDate("data_validade"));
                carrossel.setAtivo(rs.getInt("ativo"));
                //carrossel.setUrl(rs.getString("url"));
                if(rs.getBlob("imagem") != null){
                    carrossel.setImagem(rs.getBlob("imagem").getBinaryStream());
                }
                
                imagens.add(carrossel);
            }
            
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return imagens;
    }
    /*
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
*/
}
    
    
   
