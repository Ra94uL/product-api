package com.example.productapi.config;

import com.example.productapi.entity.Product;
import com.example.productapi.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {


    @Bean
    public CommandLineRunner loadProducts (ProductRepository productRepository){

        return args -> {
            if (productRepository.existsById(42L)){
                return;
            }else{
                Product product = new Product(42L,"Tangentbord",500.0);
                productRepository.save(product);
            }
        };
    }


}
