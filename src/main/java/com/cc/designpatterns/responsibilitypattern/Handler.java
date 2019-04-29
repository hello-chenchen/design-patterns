package com.cc.designpatterns.responsibilitypattern;

public abstract class Handler {
    protected Handler handler = null;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Handler getHandler() {
        return this.handler;
    }

    public abstract String handleRequest();
}