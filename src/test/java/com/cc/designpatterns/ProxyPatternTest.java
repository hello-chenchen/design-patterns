package com.cc.designpatterns;


import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.proxypattern.Component;
import com.cc.designpatterns.proxypattern.ProxyComponent;

import org.junit.Test;

public class ProxyPatternTest {
    @Test
    public void proxyTest() {
        Component component = new ProxyComponent();

        assertEquals("Proxy: ConcreateComponent::operate", component.operate());
    }
}