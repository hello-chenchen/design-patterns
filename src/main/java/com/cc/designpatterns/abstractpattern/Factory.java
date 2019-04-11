package com.cc.designpatterns.abstractpattern;

import com.cc.designpatterns.abstractpattern.AbstractFactory;
import com.cc.designpatterns.abstractpattern.FactoryType;
import com.cc.designpatterns.abstractpattern.FactoryAType;
import com.cc.designpatterns.abstractpattern.FactoryBType;
public class Factory {

    public AbstractFactory generateFactory(FactoryType type) {
        AbstractFactory abstractFactory = null;
        switch(type) {
            case CC_ENUM_FACTORY_TYPE_A: {
                abstractFactory = new FactoryA();
                break;
            }
            case CC_ENUM_FACTORY_TYPE_B: {
                abstractFactory = new FactoryB();
                break;
            }
            default:
                break;
        }

        return abstractFactory;
    }
}