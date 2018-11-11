package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

    public static String getUsuario(String email, String senha) {
        String resp = "";
        try {
            Connection conn = Conecta.getConexao();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM tb_cliente WHERE email=? AND senha=?");
            ps.setString(1, email);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                resp = "OK";
            }
            conn.close();
        } catch (Exception e) {
            resp = null;
        }
        return resp;
    }
}
