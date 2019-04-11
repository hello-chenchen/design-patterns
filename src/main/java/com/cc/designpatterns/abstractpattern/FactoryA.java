package com.cc.designpatterns.abstractpattern;

import com.cc.designpatterns.abstractpattern.FactoryAType;
import com.cc.designpatterns.abstractpattern.AbstractFactory;
import com.cc.designpatterns.abstractpattern.FactoryAImplA;
import com.cc.designpatterns.abstractpattern.FactoryAImplB;

public class FactoryA extends AbstractFactory {

    @Override
    public FactoryAInterface getFactoryAInterface(FactoryAType type) {
        FactoryAInterface factoryAInterface = null;
        switch(type) {
            case CC_ENUM_FACTORYA_METHOD_A: {
                factoryAInterface = new FactoryAImplA();
                break;
            }
            case CC_ENUM_FACTORYA_METHOD_B: {
                factoryAInterface = new FactoryAImplB();
                break;
            }
            default:
                break;
        }

        return factoryAInterface;
    }

    @Override
    public FactoryBInterface getFactoryBInterface(FactoryBType type) {
        return null;
    }
}