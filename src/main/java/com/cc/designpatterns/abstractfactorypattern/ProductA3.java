package com.cc.designpatterns.abstractfactorypattern;

import com.cc.designpatterns.abstractfactorypattern.ProductA;

public class ProductA3 implements ProductA {
    @Override
    public String produceA() {
        return "ProductA3::produceA";
    }
}