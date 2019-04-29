package com.cc.designpatterns.visitorpattern;

public class ElementB implements Element {
    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}