package com.cc.designpatterns;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.simplebuilderpattern.*;

public class SimpleBuilderPatternTest {

    @Test
    public void builderTest() {
        ProductBuilder productBuilder = new ProductBuilder();

        Director director = new Director();

        Product product = director.generateProduct(productBuilder);

        assertEquals("ProductBuilderA", product.getPartA());
        assertEquals("ProductBuilderB", product.getPartB());
    }
}