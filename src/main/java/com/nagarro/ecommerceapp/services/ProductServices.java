package com.nagarro.ecommerceapp.services;

import com.nagarro.ecommerceapp.model.Product;
import com.nagarro.ecommerceapp.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

        private final ProductRepository productRepository;

        public ProductServices(ProductRepository productRepository) {
            this.productRepository = productRepository;
        }

        public List<Product> getAllProducts(){
            return productRepository.findAll();
        }

        public Product saveProduct(Product product){
           return productRepository.save(product);
        }

        public Product getProductById(Long id){
            return  productRepository.findById(id).orElse(null);
        }



}
