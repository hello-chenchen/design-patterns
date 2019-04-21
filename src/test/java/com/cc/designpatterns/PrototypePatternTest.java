package com.cc.designpatterns;

import org.hamcrest.Matcher;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import com.cc.designpatterns.prototypepattern.*;

public class PrototypePatternTest {
    Prototype prototype = new Prototype();

    @Test
    public void prototypeTest() throws CloneNotSupportedException {
        Prototype clone = null;
        long startTime = 0L;
        long stopTime = 0L;
        long cloneTime = 0L;
        long newTime = 0L;

        startTime = System.currentTimeMillis();
        for(int i = 0; i < 10000000; i++) {
            clone = prototype.clone();
        }
        stopTime = System.currentTimeMillis();
        cloneTime = stopTime - startTime;

        startTime = System.currentTimeMillis();
        for(int i = 0; i < 10000000; i++) {
            clone = new Prototype();
        }
        stopTime = System.currentTimeMillis();
        newTime = stopTime - startTime;

        System.out.println("cloneTime: " + cloneTime);
        System.out.println("cloneTime: " + newTime);

        assertTrue( cloneTime > newTime );  //FIXME: not cost too much resource?

        //TODO: assertTrue( newTime > cloneTime );
    }


    private Matcher greaterThanOrEqualTo(long cloneTime) {
		return null;
	}


	@Test
    public void prototypeValueTest() throws CloneNotSupportedException {
        prototype.setValue("test");

        Prototype clone = (Prototype) prototype.clone();

        assertEquals("test", clone.getValue());
        assertEquals(prototype.getValue(), clone.getValue());

        clone.setValue("test1");
        assertEquals("test", prototype.getValue());
        assertEquals("test1", clone.getValue());
        assertNotEquals(prototype.getValue(), clone.getValue());
    }
}