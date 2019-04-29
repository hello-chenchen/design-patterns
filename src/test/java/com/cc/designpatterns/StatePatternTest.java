package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.statepattern.Context;

import org.junit.Test;

public class StatePatternTest {
    @Test
    public void stateTest() {
        Context context = new Context();
        context.init();
        context.request();
        assertEquals("StateB", context.getState().getState());
        context.request();
        assertEquals("StateC", context.getState().getState());
        context.request();
        assertEquals("StateA", context.getState().getState());
    }
}