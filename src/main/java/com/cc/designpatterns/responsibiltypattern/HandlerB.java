package com.cc.designpatterns.responsibiltypattern;

import com.cc.designpatterns.responsibiltypattern.Handler;

public class HandlerB extends Handler {
    @Override
    public String handleRequest() {
        if(null == handler){
            return "HandlerB::handleRequest";
        }

        return handler.handleRequest();
    }
}