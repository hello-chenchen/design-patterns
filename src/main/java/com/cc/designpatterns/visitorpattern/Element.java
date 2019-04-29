package com.cc.designpatterns.visitorpattern;

public interface Element {
    public String accept(Visitor visitor);
}