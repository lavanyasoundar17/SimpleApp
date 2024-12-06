package com.Lav.SimpleApp.service;

import com.Lav.SimpleApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Iphone",50000), new Product(102,"Camera",70000), new Product(103,"mic",5000)));
    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream().filter(p->p.getProdId()==id).findFirst().get();
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for (int i = index; i < products.size(); i++) {
            if(products.get(i).getProdId()==prod.getProdId()) {
                index = i;
                products.set(index, prod);
            }
        }
    }

    public void deleteProduct(int prodId) {
        int index =0;
        for (int i = index; i < products.size(); i++) {
            if(products.get(i).getProdId()==prodId) {
                index = i;
                products.remove(index);
            }
        }
    }
}
