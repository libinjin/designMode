package com.youguu.status.demo1;

public class ConcreteStateA extends Status{

    @Override
    public void Handler(Context context) {
        context.setStatus(new ConcreteStateB());
    }
}
