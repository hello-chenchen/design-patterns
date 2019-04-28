package com.cc.designpatterns.mediatorpattern;

import com.cc.designpatterns.mediatorpattern.User;
import com.cc.designpatterns.mediatorpattern.UserType;

public interface Mediator {
    public boolean register(UserType type, User user);

    public boolean dispatch(UserType receiver, String message);
}