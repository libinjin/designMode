package com.youguu.sell.startegyImp;

import com.youguu.sell.CashSuper;

public class CashReturn extends CashSuper {

    private double recMoney;//接收money 收300

    private double retMoney;//返还money 返100

    public CashReturn(double recMoney, double retMoney) {
        this.recMoney = recMoney;
        this.retMoney = retMoney;
    }

    //打折出售
    @Override
    public void acceptCash(double money) {

        if(money >= retMoney){

            double result = money - retMoney;
        }

        System.out.println("执行返现金模式");

    }



}
