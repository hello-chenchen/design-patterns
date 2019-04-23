package com.cc.designpatterns;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.bridgepattern.notbridge.*;

public class NotBridgePatternTest {
    @Test
    public void AbstractCarTest() {
        AbstractCar car = new BMWAutoCar();
        assertEquals("BMWCar::Auto", car.run());
        car = new BMWManuCar();
        assertEquals("BMWCar::Manu", car.run());

        car = new BenZAutoCar();
        assertEquals("BenZCar::Auto", car.run());
        car = new BenZManuCar();
        assertEquals("BenZCar::Manu", car.run());

        car = new LandRoverAutoCar();
        assertEquals("LandRoverCar::Auto", car.run());
        car = new LandRoverManuCar();
        assertEquals("LandRoverCar::Manu", car.run());
    }
}