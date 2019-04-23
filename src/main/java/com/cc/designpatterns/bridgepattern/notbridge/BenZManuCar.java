package com.cc.designpatterns.bridgepattern.notbridge;

import com.cc.designpatterns.bridgepattern.notbridge.BenZCar;

public class BenZManuCar extends BenZCar {
    @Override
    public String run() {
        return "BenZCar::Manu";
    }
}