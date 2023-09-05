package com.shoppingproject.shoppingproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingproject.shoppingproject.Model.OrderItems;

// import org.springframework.data.repository.CrudRepository;

public interface OrderItemsRepo extends JpaRepository<OrderItems, Integer> {
    
}