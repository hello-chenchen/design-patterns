package com.cc.designpatterns.factorypattern;

import com.cc.designpatterns.factorypattern.Factory;
import com.cc.designpatterns.factorypattern.Product;
import com.cc.designpatterns.factorypattern.ProductB;

public class FactoryB implements Factory {

    public Product getProduct() {
        return new ProductB();
    }
}