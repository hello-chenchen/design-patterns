package com.cc.designpatterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite {
    protected List<Composite> child = new ArrayList<Composite>();

    public boolean addComposite(Composite composite) {
        if(null != getComposite()) {
            return child.add(composite);
        }

        return false;
    }

    public boolean delComposite(Composite composite) {
        return child.remove(composite);
    }

    public List<Composite> getAllComposite() {
        return child;
    }

    //NOTICE: this is for caller to check if the Composite is leaf or not
    public Composite getComposite() {
        return this;
    }

    public abstract String operate();
}