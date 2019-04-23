package com.cc.designpatterns.bridgepattern.bridge;

import com.cc.designpatterns.bridgepattern.bridge.Transmission;

public class LandRoverCar extends AbstractCar {

    public LandRoverCar(Transmission transmission) {
        super(transmission);
    }

    @Override
    public String run() {
        return "LandRoverCar::" + transmission.gear();
    }
}