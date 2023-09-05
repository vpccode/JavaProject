package com.shoppingproject.shoppingproject.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "OrderItems")
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_item_id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    private int quantity;
    private double unit_price;
    public Long getOrder_item_id() {
        return order_item_id;
    }
    public void setOrder_item_id(Long order_item_id) {
        this.order_item_id = order_item_id;
    }
    public Orders getOrder() {
        return order;
    }
    public void setOrder(Orders order) {
        this.order = order;
    }
    public Products getProduct() {
        return product;
    }
    public void setProduct(Products product) {
        this.product = product;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getUnit_price() {
        return unit_price;
    }
    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }
    @Override
    public String toString() {
        return "OrderItems [order_item_id=" + order_item_id + ", order=" + order + ", product=" + product
                + ", quantity=" + quantity + ", unit_price=" + unit_price + "]";
    }

    
}
