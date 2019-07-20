package com.youguu.status.demo1;

public class ConcreteStateB extends Status{

    @Override
    public void Handler(Context context) {
        context.setStatus(new ConcreteStateA());
    }
}
