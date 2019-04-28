package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.templetepattern.AbstractClass;
import com.cc.designpatterns.templetepattern.ClassA;

import org.junit.Test;

public class TempletePatternTest {
    @Test
    public void templeteTest() {
        AbstractClass abstractClass = new ClassA();

        assertEquals("func1func2", abstractClass.operate());
    }
}