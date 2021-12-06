package com.storebackend.demo.services;

import com.storebackend.demo.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    Product getProduct(long productId);

    Product addProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(long productId);
}
