package com.cc.designpatterns.abstractpattern;

import com.cc.designpatterns.abstractpattern.AbstractFactory;
import com.cc.designpatterns.abstractpattern.ProductA;
import com.cc.designpatterns.abstractpattern.ProductA2;
import com.cc.designpatterns.abstractpattern.ProductB;
import com.cc.designpatterns.abstractpattern.ProductB2;

public class FactoryB extends AbstractFactory {

    @Override
    public ProductA getProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB getProductB() {
        return new ProductB2();
    }

}