package com.example.mainMicroservice.controllers;

/**
 * @author Gaurav Rajput
 * Created on 29/11/19
 */
public class Product {
    int productId;
    String productName;
    int productPrice;

    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
