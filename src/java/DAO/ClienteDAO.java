package DAO;

import Classes.Cliente;
import java.sql.*;

public class ClienteDAO {
    
    public static Cliente getUsuario(String email) {

        Cliente usuario = new Cliente();

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM tb_cliente WHERE email=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario.setId_cliente(rs.getInt("id_cliente"));
                usuario.setCpf(rs.getString("cd_cpf"));
                usuario.setNome(rs.getString("nm_cliente"));
                usuario.setDataNascimento(rs.getDate("dt_nascimento"));
                usuario.setNivel_acesso(rs.getInt("ds_nivel_de_acesso"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCelular(rs.getString("nm_celular"));
                usuario.setTelefone(rs.getString("nm_telefone"));
                usuario.setCartao_credito(rs.getString("cartao_de_credito"));
                usuario.setAtivo(rs.getInt("ativo"));
                usuario.setEndereco(rs.getString("id_endereco"));
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
            
            // Sintaxe para inserir os dados no banco, tem 12
            String sql = "INSERT INTO tb_cliente(cd_cpf, nm_cliente, dt_nascimento, ds_nivel_de_acesso, login, senha, email, nm_celular, nm_telefone, cartao_de_credito, ativo, id_endereco) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, user.getCpf());
            ps.setString(2, user.getNome());
            ps.setDate(3, user.getDataNascimento());
            ps.setInt(4, user.getNivel_acesso());
            ps.setString(5, user.getLogin());
            ps.setString(6, user.getSenha());
            ps.setString(7, user.getEmail());
            ps.setString(8, user.getCelular());
            ps.setString(9, user.getTelefone());
            ps.setString(10, user.getCartao_credito());
            ps.setInt(11, user.getAtivo());
            ps.setString(12, user.getEndereco());
            
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