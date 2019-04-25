package com.cc.designpatterns.commandpattern;

import com.cc.designpatterns.commandpattern.Command;

public class CommandA implements Command {
    Receiver receiver = new Receiver();

    @Override
    public String excute() {
        return receiver.operate();
    }
}