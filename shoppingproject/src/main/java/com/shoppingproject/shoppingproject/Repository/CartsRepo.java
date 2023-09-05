package com.shoppingproject.shoppingproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingproject.shoppingproject.Model.Carts;

// import org.springframework.data.repository.CrudRepository;

public interface CartsRepo extends JpaRepository<Carts, Integer> {
    
}