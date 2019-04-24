package com.cc.designpatterns.simplefactorypattern;

import com.cc.designpatterns.simplefactorypattern.*;

public class Factory {

    public Product generateFactoryMethod(ProductType type) {
        Product factoryMethodInterface = null;
        switch(type) {
            case CC_ENUM_PRODUCT_A:
                factoryMethodInterface = new ProductA();
                break;
            case CC_ENUM_PRODUCT_B:
                factoryMethodInterface = new ProductB();
                break;
            default:
                break;
        }

        return factoryMethodInterface;
    }
}