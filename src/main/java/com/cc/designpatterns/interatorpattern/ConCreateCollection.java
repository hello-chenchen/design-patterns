package com.cc.designpatterns.interatorpattern;

public class ConCreateCollection<E> implements Collection<E> {
    private class Node<T> {
        protected T data;
        protected Node<T> next;

        protected Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node<E> elementData;
    private int length;

    public ConCreateCollection() {
        this.elementData = null;
        this.length = 0;
    }

    @Override
    public boolean add(E item) {
        if(null == item) {
            return false;
        }

        Node<E> data = new Node<E>(item);
        if(null == elementData) {
            elementData = data;
            length = 1;
        } else {
            Node<E> tempNode = elementData;
            while(null != tempNode.next) {
                tempNode = tempNode.next;
            }
            tempNode.next = data;
            length++;
        }

        return true;
    }

    public boolean remove(E item) {
        if(null == item || elementData == null) {
            return false;
        }

        Node<E> tempNode = elementData;
        while(tempNode != null) {
            if(tempNode.data != null && tempNode.data.equals(item)) {
                tempNode.data = tempNode.next == null ? null : tempNode.next.data;
                tempNode.next = tempNode.next == null ? null : tempNode.next.next;
                length--;
                return true;
            }
            tempNode = tempNode.next;
        }

        return false;
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public E getIndexItem(int index) {
        if(index >= length) {
            return null;
        }

        Node<E> tempNode = elementData;
        for(int i = 1; i <= index; i++) {
            tempNode = tempNode.next;
        }

        return tempNode.data;
    }

    public Interator<E> interator() {
        return new ConCreateInterator();
    }

    private class ConCreateInterator implements Interator<E> {
        private int cursor;

        public ConCreateInterator() {
            this.cursor = 0;
        }

        @Override
        public E begin() {
            return getIndexItem(0);
        }

        @Override
        public boolean hasNext() {
            return cursor >= getLength() ? false : true;
        }

        @Override
        public E next() {
            //NOTICE: return getIndexItem(collectionIndex++); is simple, but not clearly
            E data = getIndexItem(cursor);
            cursor++;

            return data;
        }
    }
}