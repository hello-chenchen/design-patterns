package com.cc.designpatterns.responsibilitypattern;

import com.cc.designpatterns.responsibilitypattern.Handler;

public class HandlerC extends Handler {
    @Override
    public String handleRequest() {
        if(null == handler){
            return "HandlerC::handleRequest";
        }

        return handler.handleRequest();
    }
}