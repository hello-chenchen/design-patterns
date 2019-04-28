package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.mementopattern.CareTaker;
import com.cc.designpatterns.mementopattern.Memento;
import com.cc.designpatterns.mementopattern.Organizator;

import org.junit.Test;

public class MementoPatternTest {
    @Test
    public void mementoTest() {
        Organizator organizator = new Organizator();
        CareTaker careTaker = new CareTaker();

        Memento memento = organizator.createMemento("Status1");
        careTaker.addMemento(memento);
        Memento memento1 = organizator.createMemento("Status2");
        Memento memento2 = organizator.createMemento("Status3");
        careTaker.addMemento(memento2);

        assertEquals("Status1", careTaker.getMemento(0).getStaus());
        assertEquals("Status3", careTaker.getMemento(1).getStaus());
    }
}