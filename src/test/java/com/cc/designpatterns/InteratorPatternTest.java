package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.interatorpattern.Collection;
import com.cc.designpatterns.interatorpattern.ConCreateCollection;
import com.cc.designpatterns.interatorpattern.Interator;

import org.junit.Test;

public class InteratorPatternTest {
    @Test
    public void beginTest() {
        Collection<String> collection = new ConCreateCollection<String>();
        Interator<String> itr = collection.interator();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        assertEquals("1", itr.begin());
    }

    @Test
    public void hasNextTest() {
        Collection<String> collection = new ConCreateCollection<String>();
        Interator<String> itr = collection.interator();
        collection.add("1");
        collection.add("2");

        assertEquals(true, itr.hasNext());
        assertEquals("1", itr.next());
        assertEquals(true, itr.hasNext());
        assertEquals("2", itr.next());
        assertEquals(false, itr.hasNext());
        assertEquals(null, itr.next());
    }
}