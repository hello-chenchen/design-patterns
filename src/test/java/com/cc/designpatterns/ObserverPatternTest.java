package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.observerpattern.Observer;
import com.cc.designpatterns.observerpattern.ObserverA;
import com.cc.designpatterns.observerpattern.ObserverB;
import com.cc.designpatterns.observerpattern.Subject;
import com.cc.designpatterns.observerpattern.SubjectA;

import org.junit.Test;

public class ObserverPatternTest {
    @Test
    public void observerTest() {
        Observer observera = new ObserverA();
        Observer observerb = new ObserverB();

        Subject subject = new SubjectA();
        subject.attach(observera);
        subject.attach(observerb);

        subject.setStatus("test");
        subject.notifyObservers();
        assertEquals("ObserverA::update::test", observera.getStatus());
        assertEquals("ObserverB::update::test", observerb.getStatus());
    }
}