/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import MODEL.user;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class UserDAO extends DAO{

    public UserDAO() {
    }
    
    public boolean checkLogin(user u){
        String sql="select id_user,name,position from user where username=? and password=?";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                u.setId(rs.getInt("id_user"));
                u.setName(rs.getString("name"));
                u.setPosition(rs.getString("position"));
                return true;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }

    
}
