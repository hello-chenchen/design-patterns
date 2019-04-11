package com.cc.designpatterns.abstractpattern;

import com.cc.designpatterns.abstractpattern.FactoryAInterface;
import com.cc.designpatterns.abstractpattern.FactoryBInterface;

public abstract class AbstractFactory {
    public abstract FactoryAInterface getFactoryAInterface(FactoryAType type);
    public abstract FactoryBInterface getFactoryBInterface(FactoryBType type);
}