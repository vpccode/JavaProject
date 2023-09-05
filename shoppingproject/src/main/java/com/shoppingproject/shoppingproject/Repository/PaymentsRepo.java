package com.shoppingproject.shoppingproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingproject.shoppingproject.Model.Payments;

// import org.springframework.data.repository.CrudRepository;

public interface PaymentsRepo extends JpaRepository<Payments, Integer> {
    
}