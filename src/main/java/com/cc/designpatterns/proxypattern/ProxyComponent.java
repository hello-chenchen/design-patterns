package com.cc.designpatterns.proxypattern;

public class ProxyComponent implements Component {
    private ConcreateComponent concreateComponent = null;

    @Override
    public String operate() {
        if(null == concreateComponent) {
            concreateComponent = new ConcreateComponent();
        }
        return "Proxy: " + concreateComponent.operate();
    }
}