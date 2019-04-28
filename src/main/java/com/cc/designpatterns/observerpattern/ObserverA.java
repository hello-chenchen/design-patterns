package com.cc.designpatterns.observerpattern;

import com.cc.designpatterns.observerpattern.Observer;

public class ObserverA extends Observer {
    @Override
    public void update(Subject subject) {
        this.status = "ObserverA::update::" + subject.getStatus();
    }
}