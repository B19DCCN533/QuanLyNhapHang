/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


public class Bill implements Serializable{
    private int id;
    private String date;
    private String Payment_method,note;
    private Supplier supplier;
    private user user;
    private ArrayList<ImportedPro> listpro;

    public Bill() {
    }

    public Bill(int id, String date, String Payment_method, String note, Supplier supplier, user user, ArrayList<ImportedPro> listpro) {
        this.id = id;
        this.date = date;
        this.Payment_method = Payment_method;
        this.note = note;
        this.supplier = supplier;
        this.user = user;
        this.listpro = listpro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    

    public String getPayment_method() {
        return Payment_method;
    }

    public void setPayment_method(String Payment_method) {
        this.Payment_method = Payment_method;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public ArrayList<ImportedPro> getListpro() {
        return listpro;
    }

    public void setListpro(ArrayList<ImportedPro> listpro) {
        this.listpro = listpro;
    }
    
    
}
