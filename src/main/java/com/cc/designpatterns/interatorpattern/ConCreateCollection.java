package com.cc.designpatterns.interatorpattern;

import java.util.Arrays;

public class ConCreateCollection<E> implements Collection<E> {
    private class Node<T> {
        protected T data;
        protected Node<T> next;
    }
    private Node<E> elementData;

    @Override
    public boolean add(E item) {
        if(null == item) {
            return false;
        }

        Node<E> data = new Node<E>();
        data.data = item;
        data.next = elementData;
        elementData = data;

        return true;
    }

    public
}