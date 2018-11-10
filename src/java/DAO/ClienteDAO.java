package DAO;

import Classes.Cliente;
import java.sql.*;

public class ClienteDAO {
    
    public static Cliente getUsuario(String email) {

        Cliente usuario = new Cliente();

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM usuario WHERE email=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario.setDataNascimento(rs.getDate("dataNascimento"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setId_cliente(rs.getInt("id_cliente"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setCelular(rs.getString("celular"));
                usuario.setLogin(rs.getString("login"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setCartao_credito(rs.getString("cartao_credito"));
                usuario.setNivel_acesso(rs.getInt("nivel_acesso"));
                usuario.setAtivo(rs.getInt("ativo"));

            } else {
                usuario = null;
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuario;
    }

    public static Cliente cadastrar(Cliente user) {
        
        try {
            // Conexão com banco de dados
            Connection con = Conecta.getConexao();
            
            // Sintaxe para inserir os dados no banco, tem 14
            String sql = "INSERT INTO usuario(dataNascimento, cpf, id_cliente, telefone, celular, login, email, senha, nome, sobrenome, endereco, cartao_credito, nivel_acesso, ativo) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, user.getDataNascimento());
            ps.setString(2, user.getCpf());
            ps.setInt(3, user.getId_cliente());
            ps.setString(4, user.getTelefone());
            ps.setString(5, user.getCelular());
            ps.setString(6, user.getLogin());
            ps.setString(7, user.getEmail());
            ps.setString(8, user.getSenha());
            ps.setString(9, user.getNome());
            ps.setString(10, user.getSobrenome());
            ps.setString(11, user.getEndereco());
            ps.setString(12, user.getCartao_credito());
            ps.setInt(13, user.getNivel_acesso());
            ps.setInt(14, user.getAtivo());
            
            ps.execute();
            
            ps.close();
            con.close();
            
            //out.println("Cadastro realizado !");

        } catch (Exception e) {
            e.printStackTrace();
            
        }

        return user;
    }
       
}