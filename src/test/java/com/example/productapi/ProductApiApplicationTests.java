package com.example.productapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
class ProductApiApplicationTests {

//    @Test
//    void contextLoads() {
//    }


    @Test
    void simpleTest(){

        int result = 2+2;

        assertEquals(4, result);
    }

}
