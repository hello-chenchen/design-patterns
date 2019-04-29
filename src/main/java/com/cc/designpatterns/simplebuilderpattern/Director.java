package com.cc.designpatterns.simplebuilderpattern;

import com.cc.designpatterns.simplebuilderpattern.Product;
import com.cc.designpatterns.simplebuilderpattern.Builder;

public class Director {
    public Product generateProduct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();

        return builder.getProduct();
    }
}