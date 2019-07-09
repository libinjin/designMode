package com.youguu.sell;

import com.youguu.sell.startegyImp.CashNormal;
import com.youguu.sell.startegyImp.CashRebate;
import com.youguu.sell.startegyImp.CashReturn;

/**
 * 简单工厂模式和策略模式结合使用
 */
public class CashContext {

    CashSuper cashSuper = null;

    public CashContext(String type) {

        switch (type){
            case "normal":
                CashNormal cashNormal = new CashNormal();
                cashSuper = cashNormal;
                break;
            case "rebat" :
                CashRebate cashRebate = new CashRebate(0.8);
                cashSuper = cashRebate;
                break;
            case "retMoney" :
                CashReturn cashReturn = new CashReturn(300,100);
                cashSuper = cashReturn;
                break;
        }
    }

    public void getResult(double money){
        cashSuper.acceptCash(money);
    }
}
