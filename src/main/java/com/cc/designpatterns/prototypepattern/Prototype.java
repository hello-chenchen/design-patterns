package com.cc.designpatterns.prototypepattern;

class Demo implements Cloneable {
    String value1;

    @Override
    public Demo clone() throws CloneNotSupportedException {
        Demo clone = null;

        clone = (Demo) super.clone();

        return clone;
    }
}

public class Prototype implements Cloneable {
    private String value;
    private Demo demo;

    public Prototype() {
        this.value = "Prototype";

        this.demo = new Demo();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        Prototype clone = null;

        clone = (Prototype) super.clone();
        clone.demo = this.demo.clone();

        return clone;
    }
}