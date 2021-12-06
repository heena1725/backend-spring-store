package com.storebackend.demo.services;

import com.storebackend.demo.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{

    List<Product> list;

    public ProductServiceImpl() {
        list = new ArrayList<>();
        list.add(new Product(10, "Hello", "there"));
        list.add(new Product(10, "Hello", "there"));
    }

    @Override
    public List<Product> getProducts() {
        return list;
    }

    @Override
    public Product getProduct(long productId) {
        for (Product product : list) {
            if(product.getId() == productId){
                return product;
            }
        }
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        list.add(product);
        return product;
    }

    @Override
    public Product updateProduct(Product product) {
        list.forEach(ele -> {
            if(ele.getId() == product.getId()){
                ele.setTitle(product.getTitle());
                ele.setDescription(product.getDescription());
            }
        });
        return product;
    }

    @Override
    public void deleteProduct(long productId) {
        list = list.stream().filter(ele -> ele.getId() != productId).collect(Collectors.toList());
    }
}
