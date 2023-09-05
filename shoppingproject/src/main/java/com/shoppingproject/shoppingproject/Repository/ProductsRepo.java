// package com.shoppingproject.shoppingproject.Repository;

// import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
// import org.springframework.data.jpa.repository.JpaRepository;

// import com.shoppingproject.shoppingproject.Model.Products;

// // import org.springframework.data.repository.CrudRepository;

// public interface ProductsRepo extends JpaRepository<Producer, Integer> {

  

//     // void deleteById(Long id);

   
    
// }

package com.shoppingproject.shoppingproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingproject.shoppingproject.Model.Categories;

// import org.springframework.data.repository.CrudRepository;

public interface ProductsRepo extends JpaRepository<Categories, Integer> {
    
}

