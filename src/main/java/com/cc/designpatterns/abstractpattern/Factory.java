package com.cc.designpatterns.abstractpattern;

import com.cc.designpatterns.abstractpattern.AbstractFactory;
import com.cc.designpatterns.abstractpattern.FactoryType;
public class Factory {

    public AbstractFactory generateFactory(FactoryType type) {
        AbstractFactory abstractFactory = null;
        switch(type) {
            case CC_ENUM_FACTORY_A: {
                abstractFactory = new FactoryA();
                break;
            }
            case CC_ENUM_FACTORY_B: {
                abstractFactory = new FactoryB();
                break;
            }
            default:
                break;
        }

        return abstractFactory;
    }
}