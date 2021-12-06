package com.storebackend.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private long id;
    private String name;
    private int price;
    private String dateOfManufacture;
    private String description;

    public Product(long id, String name, int price, String dateOfManufacture, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
        this.description = description;
    }

    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
