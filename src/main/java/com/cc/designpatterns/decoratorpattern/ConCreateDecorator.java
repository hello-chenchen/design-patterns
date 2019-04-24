package com.cc.designpatterns.decoratorpattern;

import com.cc.designpatterns.decoratorpattern.Component;
import com.cc.designpatterns.decoratorpattern.Decorator;

public class ConCreateDecorator extends Decorator {

    public ConCreateDecorator(Component component) {
        super(component);
    }

    @Override
    public String operate() {
        String ret = component.operate();
        ret += " " + otherOperate();

        return ret;
    }

    private String otherOperate() {
        return "ConCreateDecorator::otherOperate";
    }
}