package com.cc.designpatterns.factorypattern;

public class FactoryMethodA implements FactoryMethodInterface {
    public String invokeFactoryMethod() {
        System.out.println("FactoryMethodA::invokeFactoryMethod");
        return "FactoryMethodA::invokeFactoryMethod";
    }
}