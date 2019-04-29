package com.cc.designpatterns.visitorpattern;

public class PrintVisitor implements Visitor {
    @Override
    public String visit(ElementA element) {
        return "PrintVisitor::ElementA";
    }

    @Override
    public String visit(ElementB element) {
        return "PrintVisitor::ElementB";
    }

    @Override
    public String visit(ElementC element) {
        return "PrintVisitor::ElementC";
    }
}