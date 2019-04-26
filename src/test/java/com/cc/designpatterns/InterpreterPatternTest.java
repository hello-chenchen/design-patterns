package com.cc.designpatterns;

import com.cc.designpatterns.interpreterpattern.Expression;
import com.cc.designpatterns.interpreterpattern.SumExpression;
import com.cc.designpatterns.interpreterpattern.SubExpression;
import com.cc.designpatterns.interpreterpattern.TerminalExpression;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InterpreterPatternTest {
    @Test
    public void interpreterTest() {
        Expression expression = new TerminalExpression(3);
        assertEquals(3, expression.interpret());

        expression = new SumExpression(new TerminalExpression(2), new TerminalExpression(1));
        assertEquals(3, expression.interpret());

        expression = new SubExpression(new TerminalExpression(2), new TerminalExpression(1));
        assertEquals(1, expression.interpret());
    }
}