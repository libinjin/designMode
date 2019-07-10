package com.youguu.factory.operateImpl;

import com.youguu.factory.Operation;

public class OperationSub extends Operation {


    @Override
    public void acceptCash(double money) {
        System.out.println("做减法运算");
    }
}
