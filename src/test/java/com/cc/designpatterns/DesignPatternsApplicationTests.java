package com.cc.designpatterns;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.factorypattern.*;

public class DesignPatternsApplicationTests {
    Factory factory = new Factory();

    @Test
    public void generateFactoryMethodATest() {
        FactoryMethodInterface result = factory.generateFactoryMethod(FactoryMethodType.CC_ENUM_FACTORY_METHOD_A);
        assertEquals("FactoryMethodA::invokeFactoryMethod", result.invokeFactoryMethod());
    }

    @Test
    public void generateFactoryMethodBTest() {
        FactoryMethodInterface result = factory.generateFactoryMethod(FactoryMethodType.CC_ENUM_FACTORY_METHOD_B);
        assertEquals("FactoryMethodB::invokeFactoryMethod", result.invokeFactoryMethod());
    }
}
