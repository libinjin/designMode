package com.youguu.factory.operateImpl;

import com.youguu.factory.Operation;

public class OperationMul extends Operation {

    @Override
    public void acceptCash(double money) {
        System.out.println("做乘法运算");
    }
}
