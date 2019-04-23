package com.cc.designpatterns;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.cc.designpatterns.bridgepattern.bridge.*;

public class BridgePatternTest {
    @Test
    public void AbstractCarTest() {
        AbstractCar car = new BMWCar(new AutoTransmission());
        assertEquals("BMWCar::Auto", car.run());
        car = new BMWCar(new ManuTransmission());
        assertEquals("BMWCar::Manu", car.run());

        car = new BenZCar(new AutoTransmission());
        assertEquals("BenZCar::Auto", car.run());
        car = new BenZCar(new ManuTransmission());
        assertEquals("BenZCar::Manu", car.run());

        car = new LandRoverCar(new AutoTransmission());
        assertEquals("LandRoverCar::Auto", car.run());
        car = new LandRoverCar(new ManuTransmission());
        assertEquals("LandRoverCar::Manu", car.run());
    }
}