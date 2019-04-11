package com.cc.designpatterns;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.abstractpattern.*;

public class AbstractFactoryPatternTest {
    Factory factory = new Factory();

    @Test
    public void invokeFactoryAImplAMethodTest() {
        FactoryAInterface factoryAImplA = factory.generateFactory(FactoryType.CC_ENUM_FACTORY_TYPE_A).getFactoryAInterface(FactoryAType.CC_ENUM_FACTORYA_METHOD_A);
        assertEquals("FactoryAImplA::invokeMethod", factoryAImplA.invokeMethod());
    }

    @Test
    public void invokeFactoryAImplBMethodTest() {
        FactoryAInterface factoryAImplB = factory.generateFactory(FactoryType.CC_ENUM_FACTORY_TYPE_A).getFactoryAInterface(FactoryAType.CC_ENUM_FACTORYA_METHOD_B);
        assertEquals("FactoryAImplB::invokeMethod", factoryAImplB.invokeMethod());
    }

    @Test
    public void invokeFactoryBImplAMethodTest() {
        FactoryBInterface factoryBImplA = factory.generateFactory(FactoryType.CC_ENUM_FACTORY_TYPE_B).getFactoryBInterface(FactoryBType.CC_ENUM_FACTORYB_METHOD_A);
        assertEquals("FactoryBImplA::invokeMethod", factoryBImplA.invokeMethod());
    }

    @Test
    public void invokeFactoryBImplBMethodTest() {
        FactoryBInterface factoryBImplB = factory.generateFactory(FactoryType.CC_ENUM_FACTORY_TYPE_B).getFactoryBInterface(FactoryBType.CC_ENUM_FACTORYB_METHOD_B);
        assertEquals("FactoryBImplB::invokeMethod", factoryBImplB.invokeMethod());
    }
}