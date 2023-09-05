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
@Table(name = "Payments")
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payment_id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    private LocalDateTime payment_date;
    private double payment_amount;
    private String payment_status;
    public Long getPayment_id() {
        return payment_id;
    }
    public void setPayment_id(Long payment_id) {
        this.payment_id = payment_id;
    }
    public Orders getOrder() {
        return order;
    }
    public void setOrder(Orders order) {
        this.order = order;
    }
    public LocalDateTime getPayment_date() {
        return payment_date;
    }
    public void setPayment_date(LocalDateTime payment_date) {
        this.payment_date = payment_date;
    }
    public double getPayment_amount() {
        return payment_amount;
    }
    public void setPayment_amount(double payment_amount) {
        this.payment_amount = payment_amount;
    }
    public String getPayment_status() {
        return payment_status;
    }
    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }
    @Override
    public String toString() {
        return "Payments [payment_id=" + payment_id + ", order=" + order + ", payment_date=" + payment_date
                + ", payment_amount=" + payment_amount + ", payment_status=" + payment_status + "]";
    }

    
}