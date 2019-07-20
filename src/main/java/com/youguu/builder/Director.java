package com.youguu.builder;

public class Director {

    public Director(AbstractBuilder builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
