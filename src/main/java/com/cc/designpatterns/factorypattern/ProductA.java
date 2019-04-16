package com.cc.designpatterns.factorypattern;

public class ProductA implements Product {

    @Override
    public String produce() {
        return "ProductA::produce";
    }
}