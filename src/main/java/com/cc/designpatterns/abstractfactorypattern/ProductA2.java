package com.cc.designpatterns.abstractfactorypattern;

import com.cc.designpatterns.abstractfactorypattern.ProductA;

public class ProductA2 implements ProductA {

    @Override
    public String produceA() {
        return "ProductA2::produceA";
    }

}