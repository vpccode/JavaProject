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
@Table(name = "Reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long review_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    private int rating;
    private String review_text;
    private LocalDateTime review_date;
    public Long getReview_id() {
        return review_id;
    }
    public void setReview_id(Long review_id) {
        this.review_id = review_id;
    }
    public Users getUser() {
        return user;
    }
    public void setUser(Users user) {
        this.user = user;
    }
    public Products getProduct() {
        return product;
    }
    public void setProduct(Products product) {
        this.product = product;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getReview_text() {
        return review_text;
    }
    public void setReview_text(String review_text) {
        this.review_text = review_text;
    }
    public LocalDateTime getReview_date() {
        return review_date;
    }
    public void setReview_date(LocalDateTime review_date) {
        this.review_date = review_date;
    }
    @Override
    public String toString() {
        return "Reviews [review_id=" + review_id + ", user=" + user + ", product=" + product + ", rating=" + rating
                + ", review_text=" + review_text + ", review_date=" + review_date + "]";
    }

    
}