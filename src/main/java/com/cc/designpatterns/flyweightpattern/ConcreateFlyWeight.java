package com.cc.designpatterns.flyweightpattern;

import com.cc.designpatterns.flyweightpattern.FlyWeight;

public class ConcreateFlyWeight extends FlyWeight {
    public ConcreateFlyWeight(String guid) {
        super(guid);
    }

    @Override
    public String operate() {
        return "ConcreateFlyWeight::operate";
    }
}