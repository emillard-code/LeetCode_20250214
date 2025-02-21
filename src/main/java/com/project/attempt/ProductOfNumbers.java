package com.project.attempt;

import java.util.LinkedList;

public class ProductOfNumbers {

    LinkedList<Integer> stream;

    // Initiate the LinkedList<Integer> stream.
    public ProductOfNumbers() {

        stream = new LinkedList<>();

    }

    // Add int num to the stream.
    public void add(int num) {

        stream.add(num);

    }

    // Get the product of the last k numbers in stream.
    public int getProduct(int k) {

        int product = stream.get(stream.size() - 1);;

        for (int i = 1; i < k; i++) {

            product = product * stream.get(stream.size() - 1 - i);

        }

        return product;

    }

}
