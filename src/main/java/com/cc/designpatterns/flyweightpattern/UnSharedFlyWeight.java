package com.cc.designpatterns.flyweightpattern;

import com.cc.designpatterns.flyweightpattern.FlyWeight;

public class UnSharedFlyWeight extends FlyWeight {
    public UnSharedFlyWeight(String guid) {
        super(guid);
    }

    @Override
    public String operate() {
        return "UnSharedFlyWeight::operate";
    }
}