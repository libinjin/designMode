package com.youguu.observer.demo2.notify;

import com.youguu.observer.demo2.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public interface ISecretary {

    List<IObserver> OBSERVER_LIST = new ArrayList<>();
    //1.添加注册

    void attach(IObserver observer);
    //2.通知

    void notifyObservers();

}
