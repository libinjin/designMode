package com.youguu.observer.demo2.observer;

import com.youguu.observer.demo2.notify.ISecretary;

public abstract class IObserver {

    protected String name;

    protected ISecretary secretary;

    public IObserver(String name, ISecretary secretary) {
        this.name = name;
        this.secretary = secretary;
    }

    //执行被通知后的事情
    public abstract void update();

}
