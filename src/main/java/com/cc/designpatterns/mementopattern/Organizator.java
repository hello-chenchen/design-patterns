package com.cc.designpatterns.mementopattern;

import com.cc.designpatterns.mementopattern.Memento;

public class Organizator {
    private Memento memento;
    // private String status;

    public Memento createMemento(String status) {
        return new Memento(status);
    }
}