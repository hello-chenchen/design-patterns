package com.cc.designpatterns.responsibiltypattern;

import com.cc.designpatterns.responsibiltypattern.Handler;

public class HandlerC extends Handler {
    @Override
    public String handleRequest() {
        if(null == handler){
            return "HandlerC::handleRequest";
        }

        return handler.handleRequest();
    }
}