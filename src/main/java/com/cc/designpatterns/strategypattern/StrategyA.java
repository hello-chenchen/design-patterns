package com.cc.designpatterns.strategypattern;

import com.cc.designpatterns.strategypattern.Strategy;

public class StrategyA implements Strategy {
    @Override
    public String algorithm() {
        return "StrategyA::algorithm";
    }
}