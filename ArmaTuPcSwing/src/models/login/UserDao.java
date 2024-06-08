
package models.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.conection.Conexion;

public class UserDao {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public User login(String email, String password){
        String sql = "SELECT * FROM users WHERE email = ? AND pass = ?";
        User us = new User();
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            if(rs.next()){
                us.setEmail(rs.getString("email"));
                us.setPassword(rs.getString("pass"));
                us.setAdmin(rs.getBoolean("isadmin"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return us;
    }
    

    public boolean register(User us){
        String sql = "INSERT INTO users (email, pass, isadmin) VALUES (?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getEmail());
            ps.setString(2, us.getPassword());
            ps.setBoolean(3, us.isAdmin());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
