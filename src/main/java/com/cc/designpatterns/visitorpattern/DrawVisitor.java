package com.cc.designpatterns.visitorpattern;

public class DrawVisitor implements Visitor {
    @Override
    public String visit(ElementA element) {
        return "DrawVisitor::ElementA";
    }

    @Override
    public String visit(ElementB element) {
        return "DrawVisitor::ElementB";
    }

    @Override
    public String visit(ElementC element) {
        return "DrawVisitor::ElementC";
    }
}