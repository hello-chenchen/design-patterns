package com.cc.designpatterns;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.simplefactorypattern.*;

public class SimpleFactoryPatternTest {
    Factory factory = new Factory();

    @Test
    public void generateFactoryMethodATest() {
        Product result = factory.generateFactoryMethod(ProductType.CC_ENUM_PRODUCT_A);
        assertEquals("ProductA::produce", result.produce());
    }

    @Test
    public void generateFactoryMethodBTest() {
        Product result = factory.generateFactoryMethod(ProductType.CC_ENUM_PRODUCT_B);
        assertEquals("ProductB::produce", result.produce());
    }
}
