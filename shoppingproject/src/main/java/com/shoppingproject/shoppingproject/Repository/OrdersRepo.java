package com.shoppingproject.shoppingproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingproject.shoppingproject.Model.Orders;

// import org.springframework.data.repository.CrudRepository;

public interface OrdersRepo extends JpaRepository<Orders, Integer> {
    
}