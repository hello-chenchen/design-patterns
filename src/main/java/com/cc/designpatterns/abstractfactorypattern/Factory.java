package com.cc.designpatterns.abstractfactorypattern;

import com.cc.designpatterns.abstractfactorypattern.AbstractFactory;
import com.cc.designpatterns.abstractfactorypattern.FactoryType;
import com.cc.designpatterns.abstractfactorypattern.FactoryA;
import com.cc.designpatterns.abstractfactorypattern.FactoryB;
import com.cc.designpatterns.abstractfactorypattern.FactoryC;
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
            case CC_ENUM_FACTORY_C: {
                abstractFactory = new FactoryC();
                break;
            }
            default:
                break;
        }

        return abstractFactory;
    }
}