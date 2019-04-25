package com.cc.designpatterns.commandpattern;

import com.cc.designpatterns.commandpattern.Command;
import com.cc.designpatterns.commandpattern.CommandA;

public class Invoker {
    public String invoke() {
        Command command = new CommandA();
        return command.excute();
    }
}