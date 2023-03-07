package com.example.springBootJPA.repository;

import com.example.springBootJPA.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);

    Product update(Product product);
}
