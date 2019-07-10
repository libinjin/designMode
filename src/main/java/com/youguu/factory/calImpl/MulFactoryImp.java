package com.youguu.factory.calImpl;

import com.youguu.factory.IFactory;
import com.youguu.factory.Operation;
import com.youguu.factory.operateImpl.OperationMul;

public class MulFactoryImp implements IFactory {


    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
