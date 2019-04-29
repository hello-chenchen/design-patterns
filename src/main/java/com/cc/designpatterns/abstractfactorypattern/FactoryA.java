package com.cc.designpatterns.abstractfactorypattern;

import com.cc.designpatterns.abstractfactorypattern.AbstractFactory;
import com.cc.designpatterns.abstractfactorypattern.ProductA;
import com.cc.designpatterns.abstractfactorypattern.ProductA1;
import com.cc.designpatterns.abstractfactorypattern.ProductB;
import com.cc.designpatterns.abstractfactorypattern.ProductB1;

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