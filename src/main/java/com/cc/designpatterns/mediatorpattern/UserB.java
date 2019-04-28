package com.cc.designpatterns.mediatorpattern;
import com.cc.designpatterns.mediatorpattern.Mediator;
import com.cc.designpatterns.mediatorpattern.UserType;
import com.cc.designpatterns.mediatorpattern.User;

public class UserB extends User {
    public UserB(Mediator mediator) {
        super(mediator);
    }

    public boolean sendMessage(String message) {
        return mediator.dispatch(UserType.CC_USER_TYPE_A, message);
    }

    public void receiveMessage(String message) {
        receivedMessage = "UserB::receiveMessage::" + message;
    }
}