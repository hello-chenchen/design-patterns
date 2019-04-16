package com.cc.designpatterns.factorypattern;

public class ProductB implements Product {

    @Override
    public String produce() {
        return "ProductB::produce";
    }
}