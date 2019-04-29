package com.cc.designpatterns.abstractfactorypattern;

import com.cc.designpatterns.abstractfactorypattern.AbstractFactory;
import com.cc.designpatterns.abstractfactorypattern.ProductA;
import com.cc.designpatterns.abstractfactorypattern.ProductB;
import com.cc.designpatterns.abstractfactorypattern.ProductA3;
import com.cc.designpatterns.abstractfactorypattern.ProductB3;

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