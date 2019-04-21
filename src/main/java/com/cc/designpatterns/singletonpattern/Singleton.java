package com.cc.designpatterns.singletonpattern;

public class Singleton {
    private static Singleton singleton = null;
    private String value;
    private Singleton() {
        this.value = "Singleton";
    }

    public static Singleton getInstance() {
        if(singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

    public String getValue() {
        return this.value;
    }
}