package com.cc.designpatterns.factorypattern;

import com.cc.designpatterns.factorypattern.*;

public class Factory {

    public FactoryMethodInterface generateFactoryMethod(FactoryMethodType type) {
        FactoryMethodInterface factoryMethodInterface = null;
        switch(type) {
            case CC_ENUM_FACTORY_METHOD_A:
                factoryMethodInterface = new FactoryMethodA();
                break;
            case CC_ENUM_FACTORY_METHOD_B:
                factoryMethodInterface = new FactoryMethodB();
                break;
            default:
                break;
        }

        return factoryMethodInterface;
    }
}