package com.cc.designpatterns.bridgepattern.notbridge;

import com.cc.designpatterns.bridgepattern.notbridge.BenZCar;

public class BenZAutoCar extends BenZCar {
    @Override
    public String run() {
        return "BenZCar::Auto";
    }
}