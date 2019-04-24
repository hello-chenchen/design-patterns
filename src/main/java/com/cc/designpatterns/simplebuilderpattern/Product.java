package com.cc.designpatterns.simplebuilderpattern;

public class Product {
    private String partA;
    private String partB;

    public Product(String partA, String partB) {
        this.partA = partA;
        this.partB = partB;
    }

    public String getPartA() {
        return this.partA;
    }

    public void setPartA(String part) {
        this.partA = part;
    }

    public String getPartB() {
        return this.partB;
    }

    public void setPartB(String part) {
        this.partB = part;
    }
}