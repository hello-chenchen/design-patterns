package com.cc.designpatterns.simplebuilderpattern;

public abstract class Builder {
    protected Product product = new Product(null, null);
    public abstract boolean buildPartA();
    public abstract boolean buildPartB();
    public Product getProduct() {
        return product;
    }
}