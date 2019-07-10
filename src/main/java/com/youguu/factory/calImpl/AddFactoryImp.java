package com.youguu.factory.calImpl;

import com.youguu.factory.IFactory;
import com.youguu.factory.Operation;
import com.youguu.factory.operateImpl.OperationAdd;

public class AddFactoryImp implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
