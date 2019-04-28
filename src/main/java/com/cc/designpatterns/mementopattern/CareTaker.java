package com.cc.designpatterns.mementopattern;

import java.util.List;
import java.util.ArrayList;
import com.cc.designpatterns.mementopattern.Memento;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public boolean addMemento(Memento memento) {
        return mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}