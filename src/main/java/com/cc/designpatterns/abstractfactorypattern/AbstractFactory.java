package com.cc.designpatterns.abstractfactorypattern;

import com.cc.designpatterns.abstractfactorypattern.ProductA;
import com.cc.designpatterns.abstractfactorypattern.ProductB;

public abstract class AbstractFactory {
    public abstract ProductA getProductA();
    public abstract ProductB getProductB();
}