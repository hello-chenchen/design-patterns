package com.cc.designpatterns;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.factorypattern.*;

public class FactoryPatternTest {

    @Test
    public void productATest() {
        Factory factory = new FactoryA();
        Product result = factory.getProduct();
        assertEquals("ProductA::produce", result.produce());
    }

    @Test
    public void productBTest() {
        Factory factory = new FactoryB();
        Product result = factory.getProduct();
        assertEquals("ProductB::produce", result.produce());
    }
}
