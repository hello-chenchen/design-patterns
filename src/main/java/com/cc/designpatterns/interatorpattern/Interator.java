package com.cc.designpatterns.interatorpattern;

public interface Interator<E> {
    public E begin();
    public boolean hasNext();
    public E next();
}