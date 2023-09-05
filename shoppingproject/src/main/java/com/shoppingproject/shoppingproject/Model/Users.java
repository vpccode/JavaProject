package com.shoppingproject.shoppingproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
//import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToMany;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import java.util.HashSet;
//import java.util.Set;


@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
     private String username;
    private String lastname;
    private String email;
   private String password;
   private String shippingAddress;
    private String billingAddress;
   
    public Users() {
    }
    public Users(Long userId, String username, String lastname, String email, String password, String shippingAddress,
            String billingAddress) {
        this.userId = userId;
        this.username = username;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getShippingAddress() {
        return shippingAddress;
    }
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    public String getBillingAddress() {
        return billingAddress;
    }
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
     @Override
    public String toString() {
        return "Users [userId=" + userId + ", username=" + username + ", lastname=" + lastname + ", email=" + email
                + ", password=" + password + ", shippingAddress=" + shippingAddress + ", billingAddress="
                + billingAddress + "]";
    }

      
}
    