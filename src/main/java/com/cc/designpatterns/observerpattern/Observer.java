package com.cc.designpatterns.observerpattern;

public abstract class Observer {
    protected String status;
    public abstract void update(Subject subject);
    public String getStatus() {
        return status;
    }
}