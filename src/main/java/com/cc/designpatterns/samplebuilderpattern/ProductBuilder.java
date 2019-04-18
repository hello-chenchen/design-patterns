package com.cc.designpatterns.samplebuilderpattern;

public class ProductBuilder implements Builder {
    private Product product = new Product(null, null);

    public boolean buildPartA() {
        product.setPartA("ProductBuilderA");
        return true;
    }

    public boolean buildPartB() {
        product.setPartB("ProductBuilderB");
        return true;
    }

    public Product getProduct() {
        return product;
    }
}