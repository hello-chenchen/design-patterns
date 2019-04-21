package com.cc.designpatterns.factorypattern;

import com.cc.designpatterns.factorypattern.Product;

public class ProductB implements Product {
    public String produce() {
        return "ProductB::produce";
    }
}