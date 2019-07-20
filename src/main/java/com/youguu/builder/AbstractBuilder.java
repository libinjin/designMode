package com.youguu.builder;

/**
 * 建造者模式
 */
public abstract class AbstractBuilder {

    //具体构建步骤A、B、C
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public abstract Product getResult();

}
