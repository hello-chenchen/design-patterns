package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.mediatorpattern.Mediator;
import com.cc.designpatterns.mediatorpattern.MediatorA;
import com.cc.designpatterns.mediatorpattern.User;
import com.cc.designpatterns.mediatorpattern.UserA;
import com.cc.designpatterns.mediatorpattern.UserB;
import com.cc.designpatterns.mediatorpattern.UserType;

import org.junit.Test;

public class MediatorPatternTest {
    @Test
    public void mediatorTest() {
        Mediator mediator = new MediatorA();
        User usera = new UserA(mediator);
        User userb = new UserB(mediator);
        mediator.register(UserType.CC_USER_TYPE_A, usera);
        mediator.register(UserType.CC_USER_TYPE_B, userb);

        usera.sendMessage("cc");
        assertEquals("UserB::receiveMessage::cc", userb.getReceiveMessage());
        userb.sendMessage("dd");
        assertEquals("UserA::receiveMessage::dd", usera.getReceiveMessage());
    }
}