package com.example.productapi.controller;

import com.example.productapi.dto.ProductDto;
import com.example.productapi.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/api/products/{id}")
    public ProductDto getProduct (@PathVariable Long id){

        return productService.getProductById(id);

    }
}
