package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }
    public Product getProduct(int prodId){
        return repo.findById(prodId).orElseThrow();
    }
    public void addProducts(Product product){
        repo.save(product);
    }
    public void updateProducts(Product product){
        repo.save(product);
    }
    public void deleteProduct(Product product){
        repo.delete(product);
    }
}
