package com.cc.designpatterns.responsibilitypattern;

import com.cc.designpatterns.responsibilitypattern.Handler;

public class HandlerA extends Handler {
    @Override
    public String handleRequest() {
        if(null == handler){
            return "HandlerA::handleRequest";
        }

        return handler.handleRequest();
    }
}