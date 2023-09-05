package com.shoppingproject.shoppingproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingproject.shoppingproject.Model.Categories;

// import org.springframework.data.repository.CrudRepository;

public interface CategoriersRepo extends JpaRepository<Categories, Integer> {
    
}