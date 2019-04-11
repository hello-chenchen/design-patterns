package com.cc.designpatterns.abstractpattern;

import com.cc.designpatterns.abstractpattern.FactoryBType;
import com.cc.designpatterns.abstractpattern.AbstractFactory;
import com.cc.designpatterns.abstractpattern.FactoryBImplA;
import com.cc.designpatterns.abstractpattern.FactoryBImplB;

public class FactoryB extends AbstractFactory {

    @Override
    public FactoryAInterface getFactoryAInterface(FactoryAType type) {
        return null;
    }

    @Override
    public FactoryBInterface getFactoryBInterface(FactoryBType type) {
        FactoryBInterface factoryBInterface = null;
        switch(type) {
            case CC_ENUM_FACTORYB_METHOD_A: {
                factoryBInterface = new FactoryBImplA();
                break;
            }
            case CC_ENUM_FACTORYB_METHOD_B: {
                factoryBInterface = new FactoryBImplB();
                break;
            }
            default:
                break;
        }

        return factoryBInterface;
    }
}