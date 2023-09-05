package com.shoppingproject.shoppingproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

// import org.springframework.data.repository.CrudRepository;

import com.shoppingproject.shoppingproject.Model.Users;


public interface UsersRepo extends JpaRepository<Users, Long> {
    
}