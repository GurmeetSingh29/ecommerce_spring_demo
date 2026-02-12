package com.nagarro.ecommerceapp.repository;

import com.nagarro.ecommerceapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
