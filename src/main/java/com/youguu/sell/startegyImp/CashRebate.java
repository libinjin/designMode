package com.youguu.sell.startegyImp;

import com.youguu.sell.CashSuper;

public class CashRebate extends CashSuper {


    private double bate;//打折

    public CashRebate(double bate) {
        this.bate = bate;
    }

    //打折出售
    @Override
    public void acceptCash(double money) {

        System.out.println("执行打折模式");
    }
}
