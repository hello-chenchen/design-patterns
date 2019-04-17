package com.cc.designpatterns.abstractpattern;

// import com.cc.designpatterns.factorypattern.ProductA;
// import com.cc.designpatterns.factorypattern.ProductB;

public abstract class AbstractFactory {
    public abstract ProductA getProductA();
    public abstract ProductB getProductB();
}