package com.storebackend.demo.services;

import com.storebackend.demo.dao.ProductDao;
import com.storebackend.demo.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public ProductServiceImpl() {

    }

    @Override
    public List<Product> getProducts() {
        return productDao.findAll();
    }

    @Override
    public Product getProduct(long productId) {
        return productDao.getById(productId);
    }

    @Override
    public Product addProduct(Product product) {
        productDao.save(product);
        return product;
    }

    @Override
    public Product updateProduct(Product product) {
        productDao.save(product);
        return product;
    }

    @Override
    public void deleteProduct(long productId) {
        Product entity = productDao.getById(productId);
        productDao.delete(entity);
    }
}
