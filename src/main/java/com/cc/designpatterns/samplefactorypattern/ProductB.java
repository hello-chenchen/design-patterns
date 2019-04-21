package com.cc.designpatterns.samplefactorypattern;

public class ProductB implements Product {

    @Override
    public String produce() {
        return "ProductB::produce";
    }
}