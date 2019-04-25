package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.responsibiltypattern.Handler;
import com.cc.designpatterns.responsibiltypattern.HandlerA;
import com.cc.designpatterns.responsibiltypattern.HandlerB;
import com.cc.designpatterns.responsibiltypattern.HandlerC;

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