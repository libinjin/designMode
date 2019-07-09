package com.youguu.sell.startegyImp;

import com.youguu.sell.CashSuper;

public class CashNormal extends CashSuper {

    //原价出售
    @Override
    public void acceptCash(double money) {

        System.out.println("原价收费策略");
    }


}
