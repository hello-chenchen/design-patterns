package com.cc.designpatterns.simplefactorypattern;

public class ProductB implements Product {

    @Override
    public String produce() {
        return "ProductB::produce";
    }
}