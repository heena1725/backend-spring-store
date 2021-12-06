package com.storebackend.demo.dao;

import com.storebackend.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Long> {

}
