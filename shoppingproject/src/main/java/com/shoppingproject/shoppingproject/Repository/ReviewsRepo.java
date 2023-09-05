package com.shoppingproject.shoppingproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingproject.shoppingproject.Model.Reviews;

// import org.springframework.data.repository.CrudRepository;

public interface ReviewsRepo extends JpaRepository<Reviews, Integer> {
    
}