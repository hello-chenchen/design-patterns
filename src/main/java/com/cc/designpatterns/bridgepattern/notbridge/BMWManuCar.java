package com.cc.designpatterns.bridgepattern.notbridge;

import com.cc.designpatterns.bridgepattern.notbridge.BMWCar;

public class BMWManuCar extends BMWCar {
    @Override
    public String run() {
        return "BMWCar::Manu";
    }
}