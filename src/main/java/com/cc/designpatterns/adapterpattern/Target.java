package com.cc.designpatterns.adapterpattern;

import com.cc.designpatterns.adapterpattern.Adaptee;

public abstract class Target {
    protected Adaptee adaptee = new Adaptee();

    public abstract Integer adapterMethod();
}