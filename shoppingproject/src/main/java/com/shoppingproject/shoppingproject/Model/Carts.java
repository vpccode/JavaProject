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
@Table(name = "Carts")

public class Carts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cart_id;
    private LocalDateTime created_at;

    @ManyToOne
    @JoinColumn(name = "user_id")

    private Users user;

    public Users getUser() {
        return user;
    }
    public void setUser(Users user) {
        this.user = user;
    }

  public Long getCart_id() {
        return cart_id;
    }
    public void setCart_id(Long cart_id) {
        this.cart_id = cart_id;
    }
    public LocalDateTime getCreated_at() {
        return created_at;
    }
    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
   
     @Override
    public String toString() {
        return "Carts [cart_id=" + cart_id + ", user=" + user + ", created_at=" + created_at + "]";
    }
    
} 
