package com.cc.designpatterns.mediatorpattern;
import com.cc.designpatterns.mediatorpattern.Mediator;

public abstract class User {
    protected Mediator mediator;
    protected String receivedMessage;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract boolean sendMessage(String message);

    public abstract void receiveMessage(String message);

    public String getReceiveMessage() {
        return receivedMessage;
    }
}