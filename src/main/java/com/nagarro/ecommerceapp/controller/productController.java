package com.nagarro.ecommerceapp.controller;

import com.nagarro.ecommerceapp.model.Product;
import com.nagarro.ecommerceapp.services.ProductServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/products")
public class productController {

    private final ProductServices service;

    public productController(ProductServices service) {
        this.service = service;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return service.getProductById(id);
    }


}
