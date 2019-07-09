package com.youguu.sell;

/**
 * 用于聚合抽象类
 * 封装各种策略
 * 策略模式
 * 策略模式时定义一系列算法
 * 的方法，这些算法都是做相同的
 * 工作，只是实现不同，它可以以
 * 相同的方式调用所有的算法，减少了
 * 算法与算法之间的耦合度。
 *
 */
public class Context {

    private CashSuper strategy;

    public Context(CashSuper strategy) {
        this.strategy = strategy;
    }

    public void getResult(double money){
        strategy.acceptCash(money);
    }


}
