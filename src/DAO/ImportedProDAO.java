/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import MODEL.Bill;
import MODEL.ImportedPro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ASUS
 */
public class ImportedProDAO extends DAO{

    public ImportedProDAO() {
    }
    
    public int getrowcount(){
        String sql = "SELECT count(id_importedpro) as dem FROM imported_pro ";
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
    
    public void addImportedpro(ImportedPro ipro,Bill b){
        String sql = "insert into imported_pro values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,getrowcount()+1);
            ps.setFloat(2, ipro.getAmount());
            ps.setFloat(3, ipro.getPrice());
            ps.setFloat(4, ipro.getSaleoff());
            ps.setString(5,ipro.getNote());
            ps.setInt(6,b.getId());
            ps.setInt(7,ipro.getProduct().getId());
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
