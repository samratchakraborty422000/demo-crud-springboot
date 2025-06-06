package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Product getProduct(@PathVariable int prodId){
        return service.getProduct(prodId);
    }
    @PostMapping("/products")
    public void addProducts(@RequestBody Product product){
        service.addProducts(product);
    }
    @PutMapping("/products")
    public void updateProducts(@RequestBody Product product){
        service.updateProducts(product);
    }
    @DeleteMapping("/products")
    public void deleteProduct(@RequestBody Product product){
        service.deleteProduct(product);
    }

}
