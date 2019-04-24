package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.decoratorpattern.Component;
import com.cc.designpatterns.decoratorpattern.ConCreateComponent;
import com.cc.designpatterns.decoratorpattern.ConCreateDecorator;
import com.cc.designpatterns.decoratorpattern.Decorator;

import org.junit.Test;

public class DecoratorPatternTest {
    @Test
    public void subComponentTest() {
        Component component = new ConCreateComponent();

        assertEquals("ConCreateComponent::operate", component.operate());
    }

    @Test
    public void decoratorTest() {
        Component component = new ConCreateComponent();

        Decorator decorator = new ConCreateDecorator(component);

        assertEquals("ConCreateComponent::operate ConCreateDecorator::otherOperate", decorator.operate());
    }
}