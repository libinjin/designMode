package com.youguu.observer.demo2.observer;

import com.youguu.observer.demo2.notify.ISecretary;

public class ObServer2 extends IObserver{

    public ObServer2(String name, ISecretary secretary) {
        super(name, secretary);
    }

    @Override
    public void update() {
        System.out.println(name+"关闭股票行情，继续工作");
    }
}
