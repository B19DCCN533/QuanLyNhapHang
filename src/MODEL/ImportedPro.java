/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class ImportedPro implements Serializable{
    private int id;
    private float amount,price,saleoff;
    private String note;
    private Product product;

    public ImportedPro() {
    }

    public ImportedPro(int id, float amount, float price, float saleoff, String note, Product product) {
        this.id = id;
        this.amount = amount;
        this.price = price;
        this.saleoff = saleoff;
        this.note = note;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSaleoff() {
        return saleoff;
    }

    public void setSaleoff(float saleoff) {
        this.saleoff = saleoff;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public Object[] toObject() {
        return new Object[]{
            product.getId(),product.getName()
                ,product.getPrice(),product.getOrigin(),product.getSl()
        };
    }
    
}
