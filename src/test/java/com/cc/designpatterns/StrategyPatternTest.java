package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.strategypattern.Context;
import com.cc.designpatterns.strategypattern.StrategyA;
import com.cc.designpatterns.strategypattern.StrategyB;

import org.junit.Test;

public class StrategyPatternTest {
    @Test
    public void strategyTest() {
        Context context = new Context();

        context.setStrategy(new StrategyA());
        assertEquals("StrategyA::algorithm", context.operate());

        context.setStrategy(new StrategyB());
        assertEquals("StrategyB::algorithm", context.operate());
    }
}