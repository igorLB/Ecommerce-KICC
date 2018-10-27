package DAO;

import Classes.Cliente;
import java.sql.*;

public class ClienteDAO {

    public static Cliente cadastrar(Cliente user) {
        
        try {
            // Conexão com banco de dados
            Connection con = Conecta.getConexao();
            
            // Sintaxe para inserir os dados no banco, tem 14
            String sql = "INSERT INTO usuario(dataNascimento, cpf, id_cliente, telefone, celular, login, email, senha, nome, sobrenome, endereco, cartao_credito, nivel_acesso, ativo) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, user.getDataNascimento());
            ps.setLong(2, user.getCpf());
            ps.setInt(3, user.getId_cliente());
            ps.setInt(4, user.getTelefone());
            ps.setInt(5, user.getCelular());
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