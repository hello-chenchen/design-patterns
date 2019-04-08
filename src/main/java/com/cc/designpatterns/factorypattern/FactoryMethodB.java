package com.cc.designpatterns.factorypattern;

public class FactoryMethodB implements FactoryMethodInterface {

    @Override
    public String invokeFactoryMethod() {
        System.out.println("FactoryMethodB::invokeFactoryMethod");
        return "FactoryMethodB::invokeFactoryMethod";
    }
}