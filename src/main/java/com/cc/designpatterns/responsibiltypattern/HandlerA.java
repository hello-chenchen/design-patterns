package com.cc.designpatterns.responsibiltypattern;

import com.cc.designpatterns.responsibiltypattern.Handler;

public class HandlerA extends Handler {
    @Override
    public String handleRequest() {
        if(null == handler){
            return "HandlerA::handleRequest";
        }

        return handler.handleRequest();
    }
}