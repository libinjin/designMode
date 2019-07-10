package com.youguu.factory.operateImpl;

import com.youguu.factory.Operation;

public class OperationDiv extends Operation {

    @Override
    public void acceptCash(double money) {
        System.out.println("做除法运算");
    }
}
