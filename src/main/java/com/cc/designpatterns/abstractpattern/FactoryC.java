package com.cc.designpatterns.abstractpattern;

import com.cc.designpatterns.abstractpattern.AbstractFactory;

public class FactoryC extends AbstractFactory {

    @Override
    public ProductA getProductA() {
        return new ProductA3();
    }

    @Override
    public ProductB getProductB() {
        return new ProductB3();
    }
}