package com.cc.designpatterns.proxypattern;

public class ProxyComponent implements Component {
    private ConcreateComponent concreateComponent = new ConcreateComponent();

    @Override
    public String operate() {
        return "Proxy: " + concreateComponent.operate();
    }
}