package com.youguu.builder;

public class Builder1 extends AbstractBuilder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public void buildPartC() {
        product.add("部件C");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
