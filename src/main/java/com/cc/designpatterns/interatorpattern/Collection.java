package com.cc.designpatterns.interatorpattern;

import com.cc.designpatterns.interatorpattern.Interator;

public interface Collection<E> {

    public Interator<E> interator();

    public boolean add(E item);

    public boolean remove(E item);

    public E getIndexItem(int index);

    public int getLength();
}