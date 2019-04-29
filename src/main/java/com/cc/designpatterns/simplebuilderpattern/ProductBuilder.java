package com.cc.designpatterns.simplebuilderpattern;

import com.cc.designpatterns.simplebuilderpattern.Builder;

public class ProductBuilder extends Builder {

    public boolean buildPartA() {
        product.setPartA("ProductBuilderA");
        return true;
    }

    public boolean buildPartB() {
        product.setPartB("ProductBuilderB");
        return true;
    }
}