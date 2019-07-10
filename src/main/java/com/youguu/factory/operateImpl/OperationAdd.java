package com.youguu.factory.operateImpl;

import com.youguu.factory.Operation;

public class OperationAdd extends Operation {

    @Override
    public void acceptCash(double money) {
        System.out.println("做加法运算");
    }
}
