package com.youguu.observer.demo2.observer;

import com.youguu.observer.demo2.notify.ISecretary;

public class ObServer1 extends IObserver{

    public ObServer1(String name, ISecretary secretary) {
        super(name, secretary);
    }

    @Override
    public void update() {
        System.out.println(name+"关闭NBA赛事，继续工作");
    }
}
