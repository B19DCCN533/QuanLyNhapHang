/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.Supplier;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class SupplierDAO extends DAO {

    public SupplierDAO() {
    }

    public ArrayList<Supplier> searchSupplier(String k) {
        ArrayList<Supplier> result = new ArrayList<Supplier>();
        String sql = "SELECT * FROM supplier WHERE name LIKE ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + k + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Supplier sup = new Supplier();
                sup.setId(rs.getInt("id_supplier"));
                sup.setName(rs.getString("name"));
                sup.setAddress(rs.getString("address"));
                sup.setPhone_number(rs.getString("phone"));
                result.add(sup);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public void addSupplier(Supplier sup){
        String sql = "insert into supplier values(?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, sup.getId());
            ps.setString(2, sup.getName());
            ps.setString(3, sup.getAddress());
            ps.setString(4, sup.getPhone_number());
            //ResultSet rs = 
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int getrowcount(){
        String sql = "SELECT count(id_supplier) as dem FROM supplier ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt("dem");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
