package com.cc.designpatterns.strategypattern;

import com.cc.designpatterns.strategypattern.Strategy;

public class StrategyB implements Strategy {
    @Override
    public String algorithm() {
        return "StrategyB::algorithm";
    }
}