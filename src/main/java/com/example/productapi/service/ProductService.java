package com.example.productapi.service;

import com.example.productapi.dto.ProductDto;
import com.example.productapi.entity.Product;
import com.example.productapi.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductDto getProductById(Long id){

        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND
                ,"produkten hittades inte"));

        Long productId = product.getId();
        String productName = product.getName();
        double productPrice = product.getPrice();

        return new ProductDto(productId,productName,productPrice);

    }
}
