package com.cc.designpatterns.responsibilitypattern;

import com.cc.designpatterns.responsibilitypattern.Handler;

public class HandlerB extends Handler {
    @Override
    public String handleRequest() {
        if(null == handler){
            return "HandlerB::handleRequest";
        }

        return handler.handleRequest();
    }
}