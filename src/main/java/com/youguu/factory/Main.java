package com.youguu.factory;

import com.youguu.factory.calImpl.AddFactoryImp;

public class Main {

    public static void main(String[] args) {

        IFactory factory = new AddFactoryImp();

        Operation operation =  factory.createOperation();

        operation.acceptCash(99);
    }
}
