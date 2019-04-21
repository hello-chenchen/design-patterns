package com.cc.designpatterns.samplefactorypattern;

public class ProductA implements Product {

    @Override
    public String produce() {
        return "ProductA::produce";
    }
}