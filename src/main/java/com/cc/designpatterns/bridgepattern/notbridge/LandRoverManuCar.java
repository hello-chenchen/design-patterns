package com.cc.designpatterns.bridgepattern.notbridge;

import com.cc.designpatterns.bridgepattern.notbridge.LandRoverCar;

public class LandRoverManuCar extends LandRoverCar {
    @Override
    public String run() {
        return "LandRoverCar::Manu";
    }
}