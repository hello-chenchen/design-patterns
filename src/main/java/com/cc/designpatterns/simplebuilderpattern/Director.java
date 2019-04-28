package com.cc.designpatterns.simplebuilderpattern;

public class Director {
    public Product generateProduct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();

        return builder.getProduct();
    }
}