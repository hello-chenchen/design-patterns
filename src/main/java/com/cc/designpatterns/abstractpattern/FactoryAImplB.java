package com.cc.designpatterns.abstractpattern;

import com.cc.designpatterns.abstractpattern.FactoryAInterface;

public class FactoryAImplB implements FactoryAInterface {

    @Override
    public String invokeMethod() {
        return "FactoryAImplB::invokeMethod";
    }

}