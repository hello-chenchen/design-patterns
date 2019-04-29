package com.cc.designpatterns.abstractfactorypattern;

import com.cc.designpatterns.abstractfactorypattern.ProductA;

public class ProductA1 implements ProductA {

    @Override
    public String produceA() {
        return "ProductA1::produceA";
    }

}