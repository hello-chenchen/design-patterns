package com.cc.designpatterns.observerpattern;

import com.cc.designpatterns.observerpattern.Observer;

public class ObserverB extends Observer {
    @Override
    public void update(Subject subject) {
        this.status = "ObserverB::update::" + subject.getStatus();
    }
}