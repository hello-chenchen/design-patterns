package com.cc.designpatterns.abstractpattern;

import com.cc.designpatterns.abstractpattern.FactoryBInterface;

public class FactoryBImplB implements FactoryBInterface {

    @Override
    public String invokeMethod() {
        return "FactoryBImplB::invokeMethod";
    }

}