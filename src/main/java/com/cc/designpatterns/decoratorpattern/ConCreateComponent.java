package com.cc.designpatterns.decoratorpattern;

import com.cc.designpatterns.decoratorpattern.Component;

public class ConCreateComponent implements Component {
    @Override
    public String operate() {
        return "ConCreateComponent::operate";
    }
}