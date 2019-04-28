package com.cc.designpatterns.mediatorpattern;

import java.util.HashMap;
import java.util.Map;

import com.cc.designpatterns.mediatorpattern.Mediator;

public class MediatorA implements Mediator {
    private Map<UserType, User> mediatorMap = new HashMap<UserType, User>();
    public boolean register(UserType type, User user) {
        return mediatorMap.put(type, user) == null ? false : true;
    }

    public boolean dispatch(UserType type, String message) {
        User user = mediatorMap.get(type);
        if(null == user) {
            return false;
        }

        user.receiveMessage(message);
        return true;
    }
}