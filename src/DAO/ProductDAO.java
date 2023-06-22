/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.Product;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ASUS
 */
public class ProductDAO extends DAO{

    public ProductDAO() {
    }
    public ArrayList<Product> searchProduct(String k) {
        ArrayList<Product> result = new ArrayList<>();
        String sql = "SELECT * FROM product WHERE name LIKE ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + k + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setId(rs.getInt("id_product"));
                pro.setName(rs.getString("name"));
                pro.setPrice(rs.getFloat("price"));
                pro.setBrand(rs.getString("brand"));
                pro.setOrigin(rs.getString("origin"));
                pro.setSl(rs.getInt("amount"));
                result.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public void addProduct(Product pro){
        String sql = "insert into product values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            ps.setString(2, pro.getName());
            ps.setFloat(3, pro.getPrice());
            ps.setString(4, pro.getBrand());
            ps.setString(5, pro.getOrigin());
            ps.setInt(6, pro.getSl());
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int getrowcount(){
        String sql = "SELECT count(id_product) as dem FROM product ";
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
