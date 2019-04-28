package com.cc.designpatterns.strategypattern;

import com.cc.designpatterns.strategypattern.Strategy;


public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String operate() {
        return strategy.algorithm();
    }
}