package com.cc.designpatterns.templetepattern;

public abstract class AbstractClass {
    public String operate() {
        return func1() + func2();
    }

    public abstract String func1();
    public abstract String func2();
}