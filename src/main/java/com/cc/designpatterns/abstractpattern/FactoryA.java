package com.cc.designpatterns.abstractpattern;

import com.cc.designpatterns.abstractpattern.AbstractFactory;
import com.cc.designpatterns.abstractpattern.ProductA;
import com.cc.designpatterns.abstractpattern.ProductA1;
import com.cc.designpatterns.abstractpattern.ProductB;
import com.cc.designpatterns.abstractpattern.ProductB1;

public class FactoryA extends AbstractFactory {

    @Override
    public ProductA getProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB getProductB() {
        return new ProductB1();
    }

}