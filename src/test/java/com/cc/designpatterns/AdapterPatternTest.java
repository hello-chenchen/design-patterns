package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.adapterpattern.*;

import org.junit.Test;

public class AdapterPatternTest {
    @Test
    public void adapterTest() {
        Target target = new Adapter();
        Integer value = 11;
        assertEquals(value, target.adapterMethod());
    }
}