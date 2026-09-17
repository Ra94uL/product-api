package com.example.productapi.dto;

public class ProductDto {

    private Long id;
    private String name;
    private double price;


    public ProductDto(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
