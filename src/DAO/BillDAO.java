/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.Bill;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ASUS
 */
public class BillDAO extends DAO{

    public BillDAO() {
    }
    
    public void addBill(Bill b){
        String sql = "insert into bill values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,b.getId());
            ps.setString(2, b.getDate());
            ps.setString(3, b.getPayment_method());
            ps.setString(4, b.getNote());
            ps.setInt(5,b.getUser().getId());
            ps.setInt(6,b.getSupplier().getId());
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int getrowcount(){
        String sql = "SELECT count(id_bill) as dem FROM bill ";
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
