package com.cc.designpatterns.flyweightpattern;

public abstract class FlyWeight {
    protected String guid;

    public FlyWeight(String guid) {
        this.guid = guid;
    }

    public abstract String operate();
}