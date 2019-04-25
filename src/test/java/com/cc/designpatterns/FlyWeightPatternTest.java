package com.cc.designpatterns;

import com.cc.designpatterns.flyweightpattern.FlyWeightFactory;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.flyweightpattern.FlyWeight;
import org.junit.Test;

public class FlyWeightPatternTest {
    @Test
    public void flyWeightTest() {
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        FlyWeight flyWeight = flyWeightFactory.getFlyWeight("test1");
        assertEquals("ConcreateFlyWeight::operate", flyWeight.operate());
    }
}