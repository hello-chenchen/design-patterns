package com.cc.designpatterns.bridgepattern.bridge;

import com.cc.designpatterns.bridgepattern.bridge.Transmission;

public class BMWCar extends AbstractCar {

    public BMWCar(Transmission transmission) {
        super(transmission);
    }

    @Override
    public String run() {
        return "BMWCar::" + transmission.gear();
    }
}