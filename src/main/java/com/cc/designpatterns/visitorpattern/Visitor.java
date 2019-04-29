package com.cc.designpatterns.visitorpattern;

public interface Visitor {
    public String visit(ElementA element);
    public String visit(ElementB element);
    public String visit(ElementC element);
}