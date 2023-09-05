package com.shoppingproject.shoppingproject.Model;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;

    private LocalDateTime order_date;
    private double total_amount;
    private String shipping_address;
    private String payment_status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    
    public Long getOrder_id() {
        return order_id;
    }
    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }
    public Users getUser() {
        return user;
    }
    public void setUser(Users user) {
        this.user = user;
    }
    public LocalDateTime getOrder_date() {
        return order_date;
    }
    public void setOrder_date(LocalDateTime order_date) {
        this.order_date = order_date;
    }
    public double getTotal_amount() {
        return total_amount;
    }
    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }
    public String getShipping_address() {
        return shipping_address;
    }
    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }
    public String getPayment_status() {
        return payment_status;
    }
    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }
    @Override
    public String toString() {
        return "Orders [order_id=" + order_id + ", user=" + user + ", order_date=" + order_date + ", total_amount="
                + total_amount + ", shipping_address=" + shipping_address + ", payment_status=" + payment_status + "]";
    }

    
}