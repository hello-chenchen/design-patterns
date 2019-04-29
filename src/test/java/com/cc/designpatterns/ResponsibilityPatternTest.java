package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.responsibilitypattern.Handler;
import com.cc.designpatterns.responsibilitypattern.HandlerA;
import com.cc.designpatterns.responsibilitypattern.HandlerB;
import com.cc.designpatterns.responsibilitypattern.HandlerC;

import org.junit.Test;

public class ResponsibilityPatternTest {
    @Test
    public void responsibilityTest() {
        Handler handler = new HandlerA();
        assertEquals("HandlerA::handleRequest", handler.handleRequest());

        handler.setHandler(new HandlerB());
        assertEquals("HandlerB::handleRequest", handler.handleRequest());

        handler.getHandler().setHandler(new HandlerC());
        assertEquals("HandlerC::handleRequest", handler.handleRequest());
    }
}