package com.cc.designpatterns.mediatorpattern;
import com.cc.designpatterns.mediatorpattern.Mediator;
import com.cc.designpatterns.mediatorpattern.UserType;
import com.cc.designpatterns.mediatorpattern.User;

public class UserA extends User {
    public UserA(Mediator mediator) {
        super(mediator);
    }

    public boolean sendMessage(String message) {
        return mediator.dispatch(UserType.CC_USER_TYPE_B, message);
    }

    public void receiveMessage(String message) {
        receivedMessage = "UserA::receiveMessage::" + message;
    }
}