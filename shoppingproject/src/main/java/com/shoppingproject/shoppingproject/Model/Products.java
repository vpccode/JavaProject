package com.shoppingproject.shoppingproject.Model;
//import org.springframework.web.multipart.MultipartFile;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;
   private String product_name;
     private double price;
    private String description;
    private int stock_quantity;
    private String imges;
    //private String img;

    public Products(Long product_id, String product_name, double price, String description, int stock_quantity,
        String imges, Categories category) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
        this.description = description;
        this.stock_quantity = stock_quantity;
        this.imges = imges;
        this.category = category;
    }
    public Products() {
    }
    public String getImg() {
        return imges;
    }
    public void setImg(String imges) {
        this.imges = imges;
    }
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories category;

     
    public Long getProduct_id() {
        return product_id;
    }
    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public Categories getCategory() {
        return category;
    }
    public void setCategory(Categories category) {
        this.category = category;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getStock_quantity() {
        return stock_quantity;
    }
    public void setStock_quantity(int stock_quantity) {
        this.stock_quantity = stock_quantity;
    }
    @Override
    public String toString() {
        return "Products [product_id=" + product_id + ", product_name=" + product_name + ", price=" + price
                + ", description=" + description + ", stock_quantity=" + stock_quantity + ", imges=" + imges + ", category="
                + category + "]";
    }
    public void saveProductTodob(MultipartFile file, String name, String description2, double price2, int stock_quantity2) {
    }
    
    
}


