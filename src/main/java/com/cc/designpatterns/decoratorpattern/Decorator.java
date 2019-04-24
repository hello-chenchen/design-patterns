package com.cc.designpatterns.decoratorpattern;

import com.cc.designpatterns.decoratorpattern.Component;

public abstract class Decorator implements Component {
    protected Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract String operate();
}