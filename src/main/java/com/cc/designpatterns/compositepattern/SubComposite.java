package com.cc.designpatterns.compositepattern;

import com.cc.designpatterns.compositepattern.Composite;

public class SubComposite extends Composite {
    @Override
    public String operate() {
        String ret = "SubComposite::operate";
        for (Composite item : child) {
            ret += " " + item.operate();
        }

        return ret;
    }
}