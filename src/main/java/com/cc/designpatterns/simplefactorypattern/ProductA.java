package com.cc.designpatterns.simplefactorypattern;

public class ProductA implements Product {

    @Override
    public String produce() {
        return "ProductA::produce";
    }
}