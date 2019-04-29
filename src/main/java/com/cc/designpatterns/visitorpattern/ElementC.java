package com.cc.designpatterns.visitorpattern;

public class ElementC implements Element {
    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}