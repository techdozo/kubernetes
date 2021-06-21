package dev.techdozo.product.application;

import lombok.Data;

@Data
public class Product {
    private String id;
    private String name;
    private String description;
    private double price;
}
