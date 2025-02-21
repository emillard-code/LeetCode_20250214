package com.project;

import com.project.attempt.ProductOfNumbers;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    ProductOfNumbers productOfNumbers;

    @BeforeEach
    public void init() {

        productOfNumbers = new ProductOfNumbers();

    }

    @Test
    public void addTest() {

        productOfNumbers.add(5);
        assertEquals(5, productOfNumbers.getProduct(1));

        productOfNumbers.add(4);
        assertEquals(20, productOfNumbers.getProduct(2));

    }

    @Test
    public void getProductTest() {

        productOfNumbers.add(10);
        assertEquals(10, productOfNumbers.getProduct(1));

        productOfNumbers.add(20);
        assertEquals(20, productOfNumbers.getProduct(1));

    }

}
