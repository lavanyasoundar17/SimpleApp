package com.Lav.SimpleApp.controller;
import com.Lav.SimpleApp.model.Product;
import com.Lav.SimpleApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class Productcontroller {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{productId}")
    public  Product getProductById(@PathVariable int productId){
        return service.getProductById(productId);
    }

    @PostMapping ("/product")
    public void addProduct(@RequestBody Product prod){
//        System.out.println(prod);
        service.addProduct(prod);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}

