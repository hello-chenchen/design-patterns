package com.cc.designpatterns.mementopattern;

public class Memento {
    private String status;

    public Memento(String status) {
        this.status = status;
    }

    public String getStaus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}