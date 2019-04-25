package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.commandpattern.Invoker;

import org.junit.Test;

public class CommandPatternTest {
    @Test
    public void commandTest() {
        Invoker invoker = new Invoker();
        assertEquals("Receiver::operate", invoker.invoke());
    }
}