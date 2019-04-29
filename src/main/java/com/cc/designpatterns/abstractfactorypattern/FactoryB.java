package com.cc.designpatterns.abstractfactorypattern;

import com.cc.designpatterns.abstractfactorypattern.AbstractFactory;
import com.cc.designpatterns.abstractfactorypattern.ProductA;
import com.cc.designpatterns.abstractfactorypattern.ProductA2;
import com.cc.designpatterns.abstractfactorypattern.ProductB;
import com.cc.designpatterns.abstractfactorypattern.ProductB2;

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