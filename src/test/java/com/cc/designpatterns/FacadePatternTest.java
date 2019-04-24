package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.facadepattern.Facade;

import org.junit.Test;

public class FacadePatternTest {
    @Test
    public void facadeTest() {
        Facade facade = new Facade();
        System.out.println(facade.wrapOperation());
        assertEquals("SystemA::operateA SystemB::operateB SystemC::operateC", facade.wrapOperation());
    }
}