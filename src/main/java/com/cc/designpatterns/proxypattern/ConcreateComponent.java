package com.cc.designpatterns.proxypattern;

public class ConcreateComponent implements Component {
    @Override
    public String operate() {
        return "ConcreateComponent::operate";
    }
}