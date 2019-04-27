package com.cc.designpatterns.interatorpattern;

public class ConCreateInterator<E> implements Interator<E> {
    private Collection<E> collection;
    private int collectionIndex;

    public ConCreateInterator(Collection<E> collection) {
        this.collection = collection;
        this.collectionIndex = 0;
    }

    @Override
    public E begin() {
        return collection.getIndexItem(0);
    }

    @Override
    public boolean hasNext() {
        return collectionIndex == collection.getLength() ? false : true;
    }

    @Override
    public E next() {
        //NOTICE: return collection.getIndexItem(collectionIndex++); is simple, but not clearly
        E data = collection.getIndexItem(collectionIndex);
        collectionIndex++;

        return data;
    }
}