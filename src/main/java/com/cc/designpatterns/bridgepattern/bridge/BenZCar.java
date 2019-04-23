package com.cc.designpatterns.bridgepattern.bridge;

import com.cc.designpatterns.bridgepattern.bridge.Transmission;

public class BenZCar extends AbstractCar {

    public BenZCar(Transmission transmission) {
        super(transmission);
    }

    @Override
    public String run() {
        return "BenZCar::" + transmission.gear();
    }
}