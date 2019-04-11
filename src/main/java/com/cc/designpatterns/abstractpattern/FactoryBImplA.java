package com.cc.designpatterns.abstractpattern;

import com.cc.designpatterns.abstractpattern.FactoryBInterface;

public class FactoryBImplA implements FactoryBInterface {

    @Override
    public String invokeMethod() {
        return "FactoryBImplA::invokeMethod";
    }

}