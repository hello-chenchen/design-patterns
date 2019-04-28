package com.cc.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject{
    private List<Observer> observerList = new ArrayList<Observer>();
    protected String status;

    public boolean attach(Observer observer) {
        return observerList.add(observer);
    }

    public boolean detach(Observer observer) {
        return observerList.remove(observer);
    }

    public String getStatus() {
        return this.status;
    }

    public void notifyObservers() {
        for(int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(this);
        }
    }

    public abstract void setStatus(String status);
}