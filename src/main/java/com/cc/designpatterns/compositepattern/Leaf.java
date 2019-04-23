package com.cc.designpatterns.compositepattern;

import com.cc.designpatterns.compositepattern.Composite;

public class Leaf extends Composite {
    @Override
    public String operate() {
        return "Leaf::operate";
    }
}