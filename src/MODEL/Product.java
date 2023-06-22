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
public class Product implements Serializable{
    private int id;
    private String name;
    private Float price;
    private String brand,origin;
    private int sl;
    public Product() {
    }

    public Product(int id, String name, Float price, String brand, String origin, int sl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.origin = origin;
        this.sl = sl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    

    public Object[] toObject() {
        return new Object[]{
            id,name,price,brand,origin,sl
        };
    }
    
    
}
