package com.cc.designpatterns.statepattern;

import com.cc.designpatterns.statepattern.State;

public class Context {
    private State state;

    private void ChangeState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }

    public void init() {
        this.state = new StateA();
    }

    public State getState() {
        return this.state;
    }

    private class StateA implements State {

        @Override
        public void handle() {
            ChangeState(new StateB());
        }

        @Override
        public String getState() {
            return "StateA";
        }
    }

    private class StateB implements State {

        @Override
        public void handle() {
            ChangeState(new StateC());
        }

        @Override
        public String getState() {
            return "StateB";
        }
    }

    private class StateC implements State {

        @Override
        public void handle() {
            ChangeState(new StateA());
        }

        @Override
        public String getState() {
            return "StateC";
        }
    }
}