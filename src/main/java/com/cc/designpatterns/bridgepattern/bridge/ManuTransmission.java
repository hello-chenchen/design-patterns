package com.cc.designpatterns.bridgepattern.bridge;

import com.cc.designpatterns.bridgepattern.bridge.Transmission;

public class ManuTransmission implements Transmission {
    @Override
    public String gear() {
        return "Manu";
    }
}