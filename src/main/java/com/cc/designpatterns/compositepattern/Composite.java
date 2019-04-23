package com.cc.designpatterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite {
    protected List<Composite> child = new ArrayList<Composite>();

    public boolean addComposite(Composite composite) {
        return child.add(composite);
    }

    public boolean delComposite(Composite composite) {
        return child.remove(composite);
    }

    public List<Composite> getAllComposite() {
        return child;
    }

    public abstract String operate();
}