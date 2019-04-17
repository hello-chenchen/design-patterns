package com.cc.designpatterns;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.abstractpattern.*;

public class AbstractFactoryPatternTest {
    Factory factory = new Factory();

    @Test
    public void invokeProductA1MethodTest() {
        ProductA productA1 = factory.generateFactory(FactoryType.CC_ENUM_FACTORY_A).getProductA();
        assertEquals("ProductA1::produceA", productA1.produceA());
    }

    @Test
    public void invokeProductB1MethodTest() {
        ProductB productB1 = factory.generateFactory(FactoryType.CC_ENUM_FACTORY_A).getProductB();
        assertEquals("ProductB1::produceB", productB1.produceB());
    }

    @Test
    public void invokeProductA2MethodTest() {
        ProductA productA2 = factory.generateFactory(FactoryType.CC_ENUM_FACTORY_B).getProductA();
        assertEquals("ProductA2::produceA", productA2.produceA());
    }

    @Test
    public void invokeProductB2MethodTest() {
        ProductB productB2 = factory.generateFactory(FactoryType.CC_ENUM_FACTORY_B).getProductB();
        assertEquals("ProductB2::produceB", productB2.produceB());
    }

    @Test
    public void invokeProductA3MethodTest() {
        ProductA productA3 = factory.generateFactory(FactoryType.CC_ENUM_FACTORY_C).getProductA();
        assertEquals("ProductA3::produceA", productA3.produceA());
    }

    @Test
    public void invokeProductB3MethodTest() {
        ProductB productB3 = factory.generateFactory(FactoryType.CC_ENUM_FACTORY_C).getProductB();
        assertEquals("ProductB3::produceB", productB3.produceB());
    }
}