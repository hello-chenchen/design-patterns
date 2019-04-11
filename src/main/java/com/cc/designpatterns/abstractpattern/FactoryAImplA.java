package com.cc.designpatterns.abstractpattern;

import com.cc.designpatterns.abstractpattern.FactoryAInterface;

public class FactoryAImplA implements FactoryAInterface {

    @Override
    public String invokeMethod() {
        return "FactoryAImplA::invokeMethod";
    }

}