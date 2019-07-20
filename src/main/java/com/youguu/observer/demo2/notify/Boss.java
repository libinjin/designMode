package com.youguu.observer.demo2.notify;

import com.youguu.observer.demo2.observer.IObserver;

public class Boss implements ISecretary{



    @Override
    public void attach(IObserver observer) {
        OBSERVER_LIST.add(observer);
    }

    @Override
    public void notifyObservers() {

        for (IObserver observer : OBSERVER_LIST) {
            observer.update();
        }
    }
}
