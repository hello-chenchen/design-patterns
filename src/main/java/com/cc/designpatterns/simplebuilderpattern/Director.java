package com.cc.designpatterns.simplebuilderpattern;

public class Director {
    public Product generateProduct(ProductBuilder builder) {
        builder.buildPartA();
        builder.buildPartB();

        return builder.getProduct();
    }
}