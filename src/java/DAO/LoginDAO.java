
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Classes.Cliente;


public class LoginDAO {
    public static List<Cliente> getUsuario (String email, String senha){
        List<Cliente> lista = new ArrayList<>();
        try{
            Connection conn = Conecta.getConexao();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM usuario WHERE email=? AND senha=?");
            ps.setString(1, email);
            ps.setString(2, senha);
            ResultSet rs =ps.executeQuery();
            
            if(rs.next()){
                Cliente objUsuario = new Cliente();
                objUsuario.setEmail(rs.getString(1));
                objUsuario.setSenha(rs.getString(2));
                lista.add(objUsuario);
            }
            conn.close();
        }
        catch(Exception ex){
            
        }
        return lista;
    }
}
