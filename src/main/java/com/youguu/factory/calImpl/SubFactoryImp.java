package com.youguu.factory.calImpl;

import com.youguu.factory.IFactory;
import com.youguu.factory.Operation;
import com.youguu.factory.operateImpl.OperationSub;

public class SubFactoryImp implements IFactory {


    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
