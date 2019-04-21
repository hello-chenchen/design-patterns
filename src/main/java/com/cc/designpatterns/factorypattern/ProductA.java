package com.cc.designpatterns.factorypattern;

import com.cc.designpatterns.factorypattern.Product;

public class ProductA implements Product {
    public String produce() {
        return "ProductA::produce";
    }
}