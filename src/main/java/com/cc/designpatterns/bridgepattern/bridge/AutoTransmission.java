package com.cc.designpatterns.bridgepattern.bridge;

import com.cc.designpatterns.bridgepattern.bridge.Transmission;

public class AutoTransmission implements Transmission {
    @Override
    public String gear() {
        return "Auto";
    }
}