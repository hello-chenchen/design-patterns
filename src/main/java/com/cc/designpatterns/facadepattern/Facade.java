package com.cc.designpatterns.facadepattern;

import com.cc.designpatterns.facadepattern.SystemA;
import com.cc.designpatterns.facadepattern.SystemB;
import com.cc.designpatterns.facadepattern.SystemC;

public class Facade {
    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();

    public String wrapOperation() {
        String ret = systemA.operateA() + " " + systemB.operateB() + " " + systemC.operateC();
        return ret;
    }
}