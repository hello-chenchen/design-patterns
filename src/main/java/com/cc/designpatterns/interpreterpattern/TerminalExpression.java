package com.cc.designpatterns.interpreterpattern;

import com.cc.designpatterns.interpreterpattern.Expression;

public class TerminalExpression implements Expression {
    private int value;

    public TerminalExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}