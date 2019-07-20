package com.youguu.observer.demo2;

import com.youguu.observer.demo2.notify.Boss;
import com.youguu.observer.demo2.notify.ISecretary;
import com.youguu.observer.demo2.notify.Secretart;
import com.youguu.observer.demo2.observer.IObserver;
import com.youguu.observer.demo2.observer.ObServer1;
import com.youguu.observer.demo2.observer.ObServer2;

public class Main {

    public static void main(String[] args) {

        ISecretary secretary = new Secretart();

        Boss boss = new Boss();

        IObserver observer= new ObServer1("jhone", boss);

        boss.attach(observer);

        boss.notifyObservers();

        IObserver observer2 = new ObServer2("fact", secretary);

        secretary.attach(observer2);

        secretary.notifyObservers();
    }
}
