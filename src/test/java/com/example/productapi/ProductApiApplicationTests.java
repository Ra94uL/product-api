package com.example.productapi;

import com.example.productapi.entity.Product;
import com.example.productapi.repository.ProductRepository;
import com.example.productapi.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

//@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ProductApiApplicationTests {

    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductService productService;

//    @Test
//    void contextLoads() {
//    }


    @Test
    void simpleTest(){

        int result = 2+2;

        assertEquals(4, result);
    }

    @Test
    void getAllProductsTest(){

        Product p1 = new Product(1L,"Govee Table Lamp 2",750);
        Product p2 = new Product(2L,"Govee Uplighter Floor Lamp",1500);

        List<Product> products = List.of(p1,p2);

        when(productRepository.findAll()).thenReturn(products);

        List<Product> allProducts = productService.getAllProducts();

        assertEquals(products,allProducts);

    }

}
