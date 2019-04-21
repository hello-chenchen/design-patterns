package com.cc.designpatterns;

import org.hamcrest.Matcher;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.singletonpattern.*;

public class SingletonPatternTest {
    @Test
    public void singletonTest() {
        assertEquals("Singleton", Singleton.getInstance().getValue());
    }
}