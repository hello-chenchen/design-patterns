package com.cc.designpatterns.interpreterpattern;

import com.cc.designpatterns.interpreterpattern.Expression;

public class SumExpression implements Expression {
    private Expression expression1, expression2;

    public SumExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public int interpret() {
        return expression1.interpret() + expression2.interpret();
    }
}