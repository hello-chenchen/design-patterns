package com.cc.designpatterns.adapterpattern;

import com.cc.designpatterns.adapterpattern.Target;
import com.cc.designpatterns.adapterpattern.Adaptee;

public class Adapter extends Target {

    @Override
    public Integer adapterMethod() {
        String result = adaptee.method();
        return Integer.parseInt(result);
    }
}